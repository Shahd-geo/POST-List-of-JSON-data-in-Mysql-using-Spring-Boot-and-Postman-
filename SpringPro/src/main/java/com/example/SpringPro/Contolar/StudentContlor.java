package com.example.SpringPro.Contolar;

import com.example.SpringPro.Entity.Student;
import com.example.SpringPro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentContlor {
    @Autowired
    private StudentService  studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {

    }


}
