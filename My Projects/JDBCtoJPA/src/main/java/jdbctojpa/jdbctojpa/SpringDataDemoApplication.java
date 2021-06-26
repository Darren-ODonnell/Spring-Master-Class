package jdbctojpa.jdbctojpa;

import jdbctojpa.jdbctojpa.entity.Person;
import jdbctojpa.jdbctojpa.jpa.PersonJpaRepository;
import jdbctojpa.jdbctojpa.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", repository.findById(10001));
//
//        logger.info("Users with name -> {}", dao.findByName("Jack"));
//        logger.info("Deleting 10002 -> Number of users deleted -> {}", dao.deleteById(10002));
//        logger.info("All users -> {}", dao.findAll());
//        logger.info("Find Jack Dublin -> {}", dao.findByNameAndCountry("Jack", "Dublin"));
//
        logger.info("Inserting 10006 -> {}", repository.save(new Person("Tara", "Berlin", new Date())));
        logger.info("Inserting 10006 -> {}", repository.save(new Person("James", "Berlin", new Date())));
        logger.info("Inserting 10006 -> {}", repository.save(new Person("John", "Berlin", new Date())));

//        logger.info("All users -> {}", dao.findAll());
//        logger.info("Updating 10003 -> {}", repository.save(new Person("Pieter", "Utrecht ", new Date())));
//        logger.info("Updating 10003 -> {}", repository.save(new Person( 2,"Jason", "Utrecht ", new Date())));
//
//        logger.info("All users -> {}", repository.findAll());
//
//        logger.info("Deleting 1 -> {}", repository.findById(1));
//        repository.deleteById(1);
//
        logger.info("All users -> {}", repository.findAll());
    }

}
