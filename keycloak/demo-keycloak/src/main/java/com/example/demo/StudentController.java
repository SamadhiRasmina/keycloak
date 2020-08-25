package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/all")
    public List<Student> getAll(){
        return Arrays.asList(
                new Student(1001,"samadhi","Matara"),
                new Student(1002,"nirasha","Colombo")
        );
    }

}



