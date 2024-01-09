/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat2_polymorphismstatic;

/**
 *
 * CREATED 
 */
public class PolymorphismStatic {
    public static void main(String[] args) {

        // Memanggil metode keliling dengan satu argumen
        int sisiPersegi = 4;
        System.out.println("Sisi Persegi adalah: " + sisiPersegi);
        System.out.println("Keliling Persegi adalah: " + CompileTime.keliling(sisiPersegi) + "\n");

        // Memanggil metode keliling dengan dua argumen
        int panjangPersegiPanjang = 10;
        int lebarPersegiPanjang = 13;
        System.out.println("Sisi Persegi Panjang adalah: " + panjangPersegiPanjang + ", " + lebarPersegiPanjang);
        System.out.println("Keliling Persegi Panjang adalah: " + CompileTime.keliling(panjangPersegiPanjang, lebarPersegiPanjang));
    }
}
