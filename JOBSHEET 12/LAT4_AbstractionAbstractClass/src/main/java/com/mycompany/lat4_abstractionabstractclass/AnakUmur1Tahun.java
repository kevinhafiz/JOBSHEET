/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat4_abstractionabstractclass;

/**
 *
 * CREATED
 */
class AnakUmur1Tahun extends Orang {

    public void namaAyahku() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}