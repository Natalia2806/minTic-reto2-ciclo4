package com.sergio.reto2Ciclo4;

import com.sergio.reto2Ciclo4.repository.crudRepository.ProductCrudRepository;
import com.sergio.reto2Ciclo4.repository.crudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2Ciclo4Application implements CommandLineRunner {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto2Ciclo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
    }

}
