/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan4_inheritance;

/**
 *
 * CREATED 
 */
public class A {
    private int a;

    public void setA(int nilai) {
        a = nilai;
    }

    public int getA() {
        return a;
    }

    // Adding missing percentage sign and fixing the method body
    public void tampilkanNilai() {
        System.out.println("Nilai a = " + getA()); // Concatenate the result of getA() with the string
    }
}