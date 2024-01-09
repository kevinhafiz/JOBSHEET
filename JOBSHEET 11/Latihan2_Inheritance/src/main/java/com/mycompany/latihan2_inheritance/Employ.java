/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2_inheritance;

/**
 *
 * CREATED 
 */
public class Employ extends Person {

    private String noKaryawan;

    // Constructor
    public Employ(String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }

    // Method
    public void info() {
        System.out.println("No. karyawan : " + this.noKaryawan);
        super.info();
    }
}
