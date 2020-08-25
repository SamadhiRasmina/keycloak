package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/home")
    public String Home(){
        return ("Home controller");
    }

    @GetMapping("/secure")
    public @ResponseBody List<Student> allUser(){
            return studentService.findAllUser();
        }
        return Arrays.asList(
                new Student(1001, "samadhi", "Matara"),
                new Student(1002, "nirasha", "Colombo")
        );
    }




