/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan4_inheritance;

/**
 *CREATED 
 */
public class B extends A {

    private int b;

    public void setB(int nilai) {
        b = nilai;
    }

    public int getB() {
        return b;
    }

    // Overriding the tampilkanNilai method from class A
    @Override
    public void tampilkanNilai() {
        super.tampilkanNilai(); // Calling the method from class A
        System.out.println("Nilai b = " + getB());
    }    
}
