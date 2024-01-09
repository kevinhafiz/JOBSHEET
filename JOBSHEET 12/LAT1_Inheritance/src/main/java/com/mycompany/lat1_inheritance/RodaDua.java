/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat1_inheritance;

/**
 *
 * CREATED 
 */
class RodaDua extends Kendaraan {
    double NaikHargake = 0.20; // 0.2 kali hargaDasar

    public void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargake);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp." + hargaDasar);
    }
}
