package com.lnsdlhfem.mongodb.service.impl;

import com.lnsdlhfem.mongodb.entity.Person;
import com.lnsdlhfem.mongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class PojoPersonService implements PersonService{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Person person) {
        mongoTemplate.save(person);
    }
}
