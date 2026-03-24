/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import com.mycompany.studentapp.StudentModel;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Musa_
 */

    
public class ExportCSV {
    
    public static void exportToCSV(ArrayList<StudentModel> students) {
        if (students.isEmpty()) {
            System.out.println("No students to export.");
            return;
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.csv"))) {
            writer.println("SEP=,");  // Excel comma fix
            
            // Use FIRST student's modules as headers (real names)
            StudentModel first = students.get(0);
            String[] moduleNames = first.getModuleNames();
            writer.print("ID,Name,Type,Average");
            for (String mod : moduleNames) {
                writer.print("," + mod.replace(",", ""));  // Safe header
            }
            writer.println();
            
            // All students (pad shorter ones)
            for (StudentModel s : students) {
                double[] marks = s.getMarks();
                writer.printf("%s,%s,%s,%.0f",  // %.0f = NO decimals!
                    s.getId(), s.getName(), s.getStudentType(), s.calculateAverage());
                
                // Match first student's module count
                for (int i = 0; i < moduleNames.length; i++) {
                    if (i < marks.length) {
                        writer.printf(",%s", marks[i] == (int) marks[i] ? 
                            String.valueOf((int) marks[i]) :  // Whole number
                            String.format("%.1f", marks[i]));  // Decimal if needed
                    } else {
                        writer.print(",");
                    }
                }
                writer.println();
            }
            System.out.println("✅ Exported " + students.size() + " students");
        } catch (IOException e) {
            System.out.println("❌ Export failed: " + e.getMessage());
        }
    }
    }
