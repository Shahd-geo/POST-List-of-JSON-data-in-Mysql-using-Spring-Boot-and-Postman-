package com.example.SpringPro.Service;

import com.example.SpringPro.Entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student addStudent(Student student){
        return student;
    }
}