package com.skni.warsztatysghv2;

import com.skni.warsztatysghv2.registration.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.io.IOException;

@SpringBootApplication
public class WarsztatySgHv2Application {

    private final StudentService studentService;

    @Autowired
    public WarsztatySgHv2Application(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(WarsztatySgHv2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() throws IOException {
        studentService.printStudent();
    }
}
