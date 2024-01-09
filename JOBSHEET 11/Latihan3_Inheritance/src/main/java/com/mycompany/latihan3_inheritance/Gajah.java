/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan3_inheritance;

/**
 *
 * CREATED 
 */
public class Gajah extends Hewan {

    // Overriding the class method from the superclass Hewan
    public static void testClassMethod() {
        System.out.println("The Class Method in Gajah");
    }

    // Overriding the instance method from the superclass Hewan
    @Override
    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah");
    }

    public static void main(String[] args) {
        // Creating an instance of Gajah
        Gajah myGajah = new Gajah();

        // Reference of the superclass Hewan pointing to an instance of the subclass Gajah
        Hewan myHewan = myGajah;

        // Calling the overridden class method using the class name
        Gajah.testClassMethod();

        // Calling the overridden instance method through the reference of the superclass Hewan
        myHewan.testInstanceMethod();
    }
}
