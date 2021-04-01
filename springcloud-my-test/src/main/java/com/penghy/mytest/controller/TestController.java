package com.penghy.mytest.controller;

import com.penghy.mytest.model.Student;
import com.penghy.mytest.model.UserInfo;
import org.springframework.stereotype.Controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        String detail = "";
        String [] a = detail.split("\\|");

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        stringBuffer.append("aaa"+"|");
        System.out.println(stringBuffer);

        JAXBContext jbt = JAXBContext.newInstance(UserInfo.class);
        Student student = new Student();
        student.setId(1);
        student.setAge(2);
        student.setName("1111");
        Student student2 = new Student();
        student2.setId(1);
        student2.setAge(2);
        student2.setName("1111");
        UserInfo cr = new UserInfo();
        cr.setClassRoomId(101);
        cr.setClassRoomName("小班");
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        cr.setStudent(students);

        Marshaller ms = jbt.createMarshaller();

        ms.marshal(cr, System.out);
        System.out.print(ms);


    }
}
