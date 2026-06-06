package com.example.SpringPro.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @GeneratedValue
    private  int id;
    private int marke;
    private String name;
}
