package com.mycompany.studentapp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Musa_
 */
import java.util.ArrayList;

public class HighAchievers {

    
    public static void printHighAchievers(ArrayList<StudentModel> students) {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n--- HIGH ACHIEVERS (Average >= 80) ---");
        System.out.printf("%-10s | %-20s | %-12s | Average\n", "ID", "Name", "Type");
        System.out.println("=".repeat(65));

        for (StudentModel s : students) {
            if (s.calculateAverage() >= 80) {
                System.out.printf("%-10s | %-20s | %-12s | %.2f\n",
                        s.getId(),
                        s.getName(),
                        s.getStudentType(),
                        s.calculateAverage());

                
                String[] modules = s.getModuleNames();
                double[] marks = s.getMarks();
                for (int i = 0; i < modules.length; i++) {
                    System.out.println("\t" + modules[i] + ": " + marks[i]);
                }
            }
        }
        System.out.println("=".repeat(65));
    }
}