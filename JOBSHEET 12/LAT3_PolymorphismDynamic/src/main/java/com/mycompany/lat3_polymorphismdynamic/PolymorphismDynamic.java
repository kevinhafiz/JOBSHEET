/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat3_polymorphismdynamic;

/**
 *
 * CREATED 
 */
public class PolymorphismDynamic {
   public static void main(String[] args) {
        // Creating variables of Bank class
        Bank B;

        // Instantiating objects of HI and NI classes
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: " + B.sukuBunga());

        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: " + B.sukuBunga());

        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: " + B.sukuBunga());
    } 
}
