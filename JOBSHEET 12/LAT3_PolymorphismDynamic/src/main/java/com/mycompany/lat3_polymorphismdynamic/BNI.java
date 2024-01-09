/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat3_polymorphismdynamic;

/**
 *
 * CREATED 
 */
 class BNI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 10.6f;
    }
}

class Mandiri extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 9.4f;
    }
}
