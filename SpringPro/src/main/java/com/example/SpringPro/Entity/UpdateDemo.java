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

}
