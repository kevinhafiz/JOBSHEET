/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat1_inheritance;

/**
 *
 * CREATED 
 */
class RodaEmpat extends Kendaraan {
    double NaikHargake = 8; // 1 kali hargaDasar

    public void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargake);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp." + hargaDasar);
    }
}
