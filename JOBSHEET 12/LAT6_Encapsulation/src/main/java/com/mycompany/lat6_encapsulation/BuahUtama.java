/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat6_encapsulation;

/**
 *
 * CREATED 
 */
public class BuahUtama {

    public static void main(String[] args) {

        // Menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");

        // Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: " + Apel.getNamaBuah() + "\nHarga: " + Apel.getHargaBuah() + "\nWarna: " + Apel.getWarnaBuah());

        // Update harga dan warna menggunakan setter
        Apel.setWarnaBuah("Hijau");
        Apel.setHargaBuah("Rp.7000");

        System.out.println("\nInformasi terkait Apel setelah di Update");

        // Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: " + Apel.getNamaBuah() + "\nHarga: " + Apel.getHargaBuah() + "\nWarna: " + Apel.getWarnaBuah());
    }
}
