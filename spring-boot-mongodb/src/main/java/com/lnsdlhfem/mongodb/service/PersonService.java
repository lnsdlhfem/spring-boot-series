package com.lnsdlhfem.mongodb.service;

import com.lnsdlhfem.mongodb.entity.Person;

/**
 * 对person进行相关mongodb的操作，有不同的实现方式
 *
 * @ClassName: PersonService
 * @author: lnsdlhfem
 * @date: 2017/10/16 15:55
 */
public interface PersonService {

    void save(Person person);
}
