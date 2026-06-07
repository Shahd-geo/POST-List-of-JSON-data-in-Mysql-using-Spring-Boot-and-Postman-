package com.example.SpringPro.Entity;

public class UpdateDemo {
    public static void updateStudentName() {
        String currentStudentName = "Ahmed";
        String newStudentName = "Ali";
        boolean updateStatus;
        System.out.println("Current Student Name: " + currentStudentName);

        if (!currentStudentName.equals(newStudentName)) {

            currentStudentName = newStudentName;
            updateStatus = true;

            System.out.println("Student name updated successfully.");

        } else {

            updateStatus = false;

            System.out.println("No update required.");
        }

        System.out.println("Final Student Name: " + currentStudentName);

        System.out.println("Update Status: " + updateStatus);
    }
    public static void updateStudentNameTask27() {
        Student student = new Student(101,"A", "Ahmad");
        System.out.println("Before Update");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        student.setName("Ali");
        System.out.println("\nAfter Update");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}


