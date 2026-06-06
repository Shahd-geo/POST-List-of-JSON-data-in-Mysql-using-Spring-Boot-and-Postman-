package com.example.SpringPro.Repositry;

import com.example.SpringPro.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
