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
import java.util.Scanner;

public class AddStudent {

    public static void addStudent(Scanner myObj, ArrayList<StudentModel> students) {
        System.out.print("Enter student ID: ");
        String id = myObj.nextLine();

        System.out.print("Enter student name: ");
        String name = myObj.nextLine();

        System.out.print("Enter student type (Undergrad/Graduate): ");
        String type = myObj.nextLine();

        System.out.print("How many modules? ");
        int n = myObj.nextInt();
        myObj.nextLine(); // consume newline

        double[] marks = new double[n];
        String[] moduleNames = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter module %d name: ", i + 1);
            moduleNames[i] = myObj.nextLine();

            System.out.printf("Enter mark for %s: ", moduleNames[i]);
            marks[i] = myObj.nextDouble();
           myObj.nextLine();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark; using 0.");
                marks[i] = 0;
            }
        }

        StudentModel student;
        if (type.equalsIgnoreCase("Undergrad")) {
            student = new UndergraduateModel(id, name, marks, moduleNames);
        } else {
            student = new GraduateModel(id, name, marks, moduleNames);
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }
}