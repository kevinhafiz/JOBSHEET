/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

/**
 *
 * By_Jihan salsabila_22343090
 */
public class TUGAS1 {

    public static void main(String[] args) {
        // String array dengan 7 hari dalam seminggu
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Menggunakan perulangan for untuk mencetak semua nilai dari array
        for (int i = 0; i < days.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + days[i]);
        }
    }
}