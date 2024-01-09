/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan5_inheritance;

/**
 *
 * CREATED 
 */
public class UjiBus {
    public static void main(String args[]) {
        // membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();

        // memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;

        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;

        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;

        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;

        // memanggil method cetak pada kelas Bus
        busMini.cetak();
    }
}

