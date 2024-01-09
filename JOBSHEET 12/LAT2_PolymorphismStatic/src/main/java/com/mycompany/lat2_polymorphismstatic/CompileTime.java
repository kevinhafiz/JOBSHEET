/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat2_polymorphismstatic;

/**
 *
 * CREATED 
 */
public class CompileTime {
     // method keliling dengan single argumen
    static int keliling(int a) {
        return 4 * a;
    }

    // method keliling dengan dua argumen (method overloading)
    static int keliling(int L, int b) {
        return 2 * (L + b);
    }
}
