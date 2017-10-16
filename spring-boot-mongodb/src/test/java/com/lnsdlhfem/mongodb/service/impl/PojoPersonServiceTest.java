package com.lnsdlhfem.mongodb.service.impl;

import com.lnsdlhfem.mongodb.Application;
import com.lnsdlhfem.mongodb.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class PojoPersonServiceTest {

    @Autowired
    private PojoPersonService pojoPersonService;

    @Test
    public void test() {
        Person person = new Person();
        person.setId(1);
        person.setName("lnsdlhfem");
        person.setAge("23");
        person.setSex("man");

        pojoPersonService.save(person);
    }

}
