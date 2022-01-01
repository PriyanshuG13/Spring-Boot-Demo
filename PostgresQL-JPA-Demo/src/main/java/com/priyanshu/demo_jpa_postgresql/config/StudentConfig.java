package com.priyanshu.demo_jpa_postgresql.config;

import com.priyanshu.demo_jpa_postgresql.model.Student;
import com.priyanshu.demo_jpa_postgresql.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(
                List.of(
                    new Student(
                            "19BCS1958",
                            "Priyanshu Gupta",
                            "priyanshu.gupta@gmail.com",
                            LocalDate.of(2000, 12,13)
                    ),
                    new Student(
                            "19BCS1933",
                            "Vikas Singh",
                            "vikas.singh@gmail.com",
                            LocalDate.of(2000, 6,13)
                    )
                )
            );
        };
    }
}
