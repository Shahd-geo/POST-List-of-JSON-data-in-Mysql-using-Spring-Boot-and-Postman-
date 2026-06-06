package com.example.SpringPro.Contolar;

import com.example.SpringPro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentContlor {
    @Autowired
    private StudentService  studentService;



}
