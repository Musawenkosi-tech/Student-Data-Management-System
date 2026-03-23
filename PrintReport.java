/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentapp;
/**
 *
 * @author Musa_
 */
import java.util.ArrayList;

public class PrintReport {

    public static void printReport(ArrayList<StudentModel> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.printf("\n%-10s | %-20s | %-12s | Average\n", 
                          "ID", "Name", "Type");
        System.out.println("=".repeat(65));

        for (StudentModel s : students) {
            System.out.printf("%-10s | %-20s | %-12s | %.2f\n",
                    s.getId(),
                    s.getName(),
                    s.getStudentType(), 
                    s.calculateAverage());
        }

        System.out.println("=".repeat(65));
    }
}