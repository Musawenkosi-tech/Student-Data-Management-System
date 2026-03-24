/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentapp;
/**
 *
 * @author Musa_
 */
public abstract class StudentModel {
    private String id;
    private String name;
    private double[] marks;
    private String[] moduleNames;

    public StudentModel(String id, String name, double[] marks, String[] moduleNames) {
        this.id = id;
        this.name = name;
        this.marks = marks.clone();
        this.moduleNames = moduleNames.clone();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double[] getMarks() { return marks.clone(); }
    public String[] getModuleNames() { return moduleNames.clone(); }

    public double calculateAverage() {
        if (marks.length == 0) return 0.0;
        double total = 0.0;
        for (double m : marks) total += m;
        return total / marks.length;
    }

    public abstract String getStudentType();

    @Override
    public String toString() {
        return String.format("%-10s | %-20s | %-10s | Avg: %.2f",
                id, name, getStudentType(), calculateAverage());
    }
}
