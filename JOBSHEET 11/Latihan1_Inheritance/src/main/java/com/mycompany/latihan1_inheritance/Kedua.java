/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1_inheritance;

/**
 *
 * CREATED 
 */
public class Kedua extends Pertama {

    private int b = 8;

    protected void BacaSuper() {
        System.out.println("Nilai b = " + b);
        terprotek(); // Call the terprotek method from the superclass Pertama
        info();      // Call the info method from the superclass Pertama
    }
}
