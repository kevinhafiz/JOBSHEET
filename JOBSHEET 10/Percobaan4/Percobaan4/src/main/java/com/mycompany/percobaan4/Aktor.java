/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percobaan4;

/**
 *
 * @author ASUS
 */
public class Aktor {

    String nama;
    int umur;

    // Constructor with parameters
    Aktor(String n, int u) {
        nama = n;
        umur = u;
    }

    // Method to display actor information
    void tampilAktor() {
        System.out.println("Namaku: " + nama);
        System.out.println("Umurku: " + umur + " tahun");
    }

    public static void main(String[] args) {
        Aktor a;

        // Create an actor object and display information
        a = new Aktor("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("=================");

        // Create another actor object and display information
        a = new Aktor("Messi", 34);
        a.tampilAktor();
        System.out.println("=================");
    }
}
