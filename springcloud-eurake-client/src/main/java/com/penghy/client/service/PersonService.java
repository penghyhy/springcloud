package com.penghy.client.service;

import com.penghy.client.bean.Disease;
import com.penghy.client.bean.Person;
import com.penghy.client.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;  //这里会有报错，不用管

    public List<Person> select() {
        return personMapper.select();
    }

    public int insert(Person person) {
        return personMapper.insert(person);
    }


    public void update(Integer incrementId, String searchCode1) {
        personMapper.update(incrementId, searchCode1);
    }

    public List<Disease> selectDisease() {
        return personMapper.selectDisease();
    }
}


