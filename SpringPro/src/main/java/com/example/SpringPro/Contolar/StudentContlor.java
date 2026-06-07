package com.example.SpringPro.Contolar;

import com.example.SpringPro.Entity.Student;
import com.example.SpringPro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentContlor {
    @Autowired
    private StudentService  studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        return studentService.addStudent(student);

    }
    @PostMapping("/addStudentList")
    public List<Student> postDetails(@RequestBody List<Student> students) {
        return studentService.addListStudent(students);

    }
    @GetMapping("/students")
    public List<Student> getStudents(@RequestBody List<Student> students) {
        return students;
    }
    @GetMapping("/search")
    public String search(@RequestParam String name) {
        return name;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id) {
        return "Student with id " + id + " deleted";
    }
    @GetMapping("/find/{id}")
    public String findStudent(@PathVariable int id) {
        return "Student found with id = " + id;
    }


}
