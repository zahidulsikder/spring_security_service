package com.erp.security_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin", 50),
            new Student(2, "Sadia", 30),
            new Student(3, "Zahidul", 40),
            new Student(4, "Sajal", 20)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}
