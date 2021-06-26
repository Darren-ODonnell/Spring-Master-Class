package jdbctojpa.jdbctojpa;

import jdbctojpa.jdbctojpa.entity.Person;
import jdbctojpa.jdbctojpa.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", dao.findById(10001));

        logger.info("Users with name -> {}", dao.findByName("Jack"));
        logger.info("Deleting 10002 -> Number of users deleted -> {}", dao.deleteById(10002));
        logger.info("All users -> {}", dao.findAll());
        logger.info("Find Jack Dublin -> {}", dao.findByNameAndCountry("Jack", "Dublin"));

        logger.info("Inserting 10006 -> {}", dao.insert(new Person(10006, "Tara", "Berlin", new Date())));
        logger.info("All users -> {}", dao.findAll());

        logger.info("Updating 10003 -> {}", dao.update(new Person(10003, "Pieter", "Utrecht ", new Date())));
        logger.info("All users -> {}", dao.findAll());



    }

}
