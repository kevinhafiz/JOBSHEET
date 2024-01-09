/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample3;

/**
 *
 * @author ASUS
 */
public class ArraySample3 {

   public static void main(String[] args) {
        // String array 4 baris x 2 kolom
        String[][] dogs = { 
            { "Terry", "brown" },   // baris ke 0
            { "Kristin","white" }, // baris ke 1
            { "Toby", "gray" },     // baris ke 2
            { "Fido", "black" }     // baris ke 3
        };

       // Menggunakan perulangan untuk mencetak semua nama dan warna anjing
       for (String[] dog : dogs) {
           String name = dog[0];
           String color = dog[1];
           System.out.println("Nama: " + name + ", Warna: " + color);
       }
    }
}






