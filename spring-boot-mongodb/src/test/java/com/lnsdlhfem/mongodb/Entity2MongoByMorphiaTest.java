package com.lnsdlhfem.mongodb;

import com.lnsdlhfem.mongodb.entity.MongoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class Entity2MongoByMorphiaTest {

    @Autowired
    private Datastore ds;

    @Test
    public void test() {
        MongoEntity entity = new MongoEntity();
        entity.setName("entity");

        ds.save(entity);
    }
}
