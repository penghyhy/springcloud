package com.penghy.server.aop;


import com.alibaba.fastjson.JSONArray;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

//@Aspect
@Component
public class LogAspect {
    /**
     * slf4j日志
     */
    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * Pointcut 切入点
     * 匹配cn.controller包下面的所有方法
     */
    @Pointcut("execution(public * com.penghy.server.cotroller.*.*(..))")
    public void webLog() {
    }

    /**
     * 环绕通知
     */
    @Around(value = "webLog()")
    public Object arround(ProceedingJoinPoint joinPoint) {
        System.out.println("第一步，arround");
        System.out.println("---以下内容会在Before之前执行---");
        Object[] args = joinPoint.getArgs();
        System.out.println("共"+args.length+"个参数");
        for (int i = 0; i < args.length; i++) {
            System.out.println("第"+(i+1)+"个参数的旧值为："+args[i]);
        }
        //改变参数值
//        args[0]="New Hello";
        System.out.println("参数新值："+args[0]);
        System.out.println("---以上内容会在Before之前执行---");
        System.out.println();
        //执行目标方法
        System.out.println("第三步，joinPoint.proceed");
        Object result=null;
        try {
            result=joinPoint.proceed(args);
        } catch (Throwable throwable) {
            System.out.println("执行目标方法异常。"+throwable.getMessage());
        }
        System.out.println("第三/1步，joinPoint.proceed.end");
        System.out.println();
        System.out.println("---以下内容会在After之后执行---");
        if(result instanceof String){
            //改变返回值
            result="Happy New Year";
            System.out.println("增强后的返回值"+result);
        }
        System.out.println("---以上内容会在After之后执行---");

        return result;

//    }

//        Object oo = new Object();
//        try {
//            logger.info("1、Around：方法环绕开始.....");
//            Object o = pjp.proceed();
//            logger.info("3、Around：方法环绕结束，结果是 :" + o);
//            return o;
//        } catch (Throwable e) {
//            logger.error(pjp.getSignature() + " 出现异常： ", e.getMessage());
//            return oo;
//        }
    }

    /**
     * 方法执行前
     */
    @Before(value = "webLog()")
    public void before(JoinPoint joinPoint) {
        System.out.println("第二步，before");
        logger.info("-----切入点的相关信息-----");
        //目标方法的传入参数
        Object[] args = joinPoint.getArgs();
        logger.info("args:{}", JSONArray.toJSON(args).toString());
        System.out.println("共"+args.length+"个参数");
        for (int i = 0; i < args.length; i++) {
            System.out.println("第"+i+1+"个参数为："+args[i]);
        }
        //获取目标方法信息
        Signature signature = joinPoint.getSignature();
        System.out.println("目标方法名为："+signature.getName());
        System.out.println("目标方法信息："+signature);
        //可获取所属类，然后获取所属类的相关信息
        System.out.println("目标方法所属类名："+signature.getDeclaringTypeName());
        System.out.println("目标方法所属类简单类名："+signature.getDeclaringType().getSimpleName());
        System.out.println("----切入点相关信息----");
        System.out.println("");
        System.out.println("step0(Before)-目标方法"+signature.getName()+"执行前的操作。。。。");

        logger.info("2、Before：方法执行开始...");
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    /**
     * 方法执行结束，不管是抛出异常或者正常退出都会执行
     */
    @After(value = "webLog()")
    public void after() {
        System.out.println("第四步，after");
        logger.info("4、After：方法最后执行.....");
    }

    /**
     * 方法执行结束，增强处理
     */
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) {
        System.out.println("第五步：AfterReturning");
        // 处理完请求，返回内容
        logger.info("5、AfterReturning：方法的返回值 : " + ret);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing(value = "webLog()")
    public void throwss(JoinPoint joinPoint) {
        logger.error("AfterThrowing：方法异常时执行.....");
    }
}
