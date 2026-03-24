/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentapp;

/**
 *
 * @author Musa_
 */
public class UndergraduateModel extends StudentModel {

    public UndergraduateModel(String id, String name, double[] marks, String[] moduleNames) {
        super(id, name, marks, moduleNames);
    }

    @Override
    public String getStudentType() {
        return "Undergraduate";
    }
}
