package com.lnsdlhfem.mongodb.morphia;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;

@Configuration
public class MorphiaAutoConfiguration {

    @Autowired
    private MongoClient mongoClient; // created from MongoAutoConfiguration

    @Bean
    public Datastore datastore() throws ClassNotFoundException {
        Morphia morphia = new Morphia();

        // map entities, there is maybe a better way to find and map all entities
        ClassPathScanningCandidateComponentProvider entityScanner = new ClassPathScanningCandidateComponentProvider(true);
        entityScanner.addIncludeFilter(new AnnotationTypeFilter(Entity.class));
        for (BeanDefinition candidate : entityScanner.findCandidateComponents("com.lnsdlhfem.mongodb.entity")) { // from properties?
            morphia.map(Class.forName(candidate.getBeanClassName()));
        }

        return morphia.createDatastore(mongoClient, "demo"); // "dataStoreInstanceId" may come from properties?
    }

}
