package com.example.demo.student;

import java.time.LocalDate;
import static java.time.Month.JANUARY;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return (String[] args) -> {
            Student mariam = new Student(
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, JANUARY, 5),
                21
            );

            Student alex = new Student(
                "Alex",
                "alex@gmail.com",
                LocalDate.of(2004, JANUARY, 5),
                21
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
