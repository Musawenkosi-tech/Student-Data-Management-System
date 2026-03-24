/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentapp;
/**
 *
 * @author Musa_
 */
import com.mycompany.ExportCSV;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    
    private ArrayList<StudentModel> students = new ArrayList<>();

    private Scanner myObj = new Scanner(System.in);

    
    private AddStudent add = new AddStudent();
    private PrintReport report = new PrintReport();
    private HighAchievers high = new HighAchievers();

    public void menu() {
        int choice;
        do {
            System.out.println("\nPlease select any one of the menu items");
            System.out.println("1. Add Student");
            System.out.println("2. Print Report");
            System.out.println("3. High Achievers");
            System.out.println("4. Export to CSV");
            System.out.println("5. Save Students");
            System.out.println("6. Exit Management System");

            choice = myObj.nextInt();
            myObj.nextLine();

            switch (choice) {
                case 1 -> add.addStudent(myObj, students);
                case 2 -> report.printReport(students);
                case 3 -> high.printHighAchievers(students);
                case 4 -> ExportCSV.exportToCSV(students);
                case 5 -> SaveStudents.save(students); 
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid input");
            }
        } while (choice != 6);
    }
}