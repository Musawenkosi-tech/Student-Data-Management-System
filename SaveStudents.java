/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.studentapp;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;
/**
 *
 * @author Musa_
 */
public class SaveStudents {
     public static void save(ArrayList<StudentModel> students) {
        try (PrintWriter w = new PrintWriter(new FileWriter("students.dat"))) {
            w.println(students.size());
            for (StudentModel s : students) {
                w.print(s.getId() + "|" + s.getName() + "|" + s.getStudentType() + "|");
                for (double m : s.getMarks()) w.printf("%.1f,", m);
                w.println();
            }
            System.out.println("💾 Saved " + students.size() + " students!");
        } catch (Exception e) {
            System.out.println("Save failed: " + e.getMessage());
        }
    }
}
