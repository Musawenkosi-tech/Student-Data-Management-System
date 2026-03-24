/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentapp;
import com.mycompany.studentapp.Menu;
import java.util.Scanner;
/**
 *
 * @author Musa_
 * Student Management System - My Java Console App
 * 
 * This app helps lecturers/admin staff track student marks easily 
 * instead of using Excel/spreadsheets that get messy with lots of data.
 * 
 * Manual record keeping takes forever and you always make calculation errors.
 * This program fixes that by letting the user:
 * 1. Add students (ID, name, Undergrad/Grad, all their module marks)
 * 2. Auto-calculate averages for each student
 * 3. Print clean report of everyone + their performance 
 * 4. Find High Achievers (avg 80%+ automatically)
 * 
 * The system uses key programming concepts such as:
 * Arrays (to store module names and marks),
 * ArrayLists (to store multiple students dynamically),
 * Loops (to process and display data),
 * Inheritance (to distinguish between Undergraduate and Graduate students),
 * Information hiding (through private fields and public methods).
 */
public class StudentApp {

    private final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        StudentApp app = new StudentApp();
        app.run();
    }

    public void run() {

        System.out.println("************************************");
        System.out.println("Student Grade Management Service");
        System.out.println("************************************");

        System.out.print("Please type 'access' to access the Management System: ");
        String input = myObj.nextLine();

        if ("access".equalsIgnoreCase(input)) {

            Menu menu = new Menu();
            menu.menu();

        } else {
            System.out.println("Thank you for your time.");
        }
    }
}