/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2_inheritance;

/**
 *
 * CREATED 
 */
public class Person {
     protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void info() {
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}