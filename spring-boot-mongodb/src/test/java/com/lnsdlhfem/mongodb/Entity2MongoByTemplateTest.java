package com.lnsdlhfem.mongodb;

import com.lnsdlhfem.mongodb.entity.SimpleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class Entity2MongoByTemplateTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void test() {
        SimpleEntity entity = new SimpleEntity();
        entity.setId(0001);
        entity.setName("SimpleEntity");

        mongoTemplate.save(entity);
    }

}
