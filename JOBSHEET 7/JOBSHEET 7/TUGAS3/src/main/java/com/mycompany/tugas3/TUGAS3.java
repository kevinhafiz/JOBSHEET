/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

/**
 *
 * By_Jihan Salsabila_22343090
 */
public class TUGAS3 {

    public static void main(String[] args) {
        int tingkat = 5; // Jumlah tingkat (baris)

        // Loop untuk setiap tingkat
        for (int i = 1; i <= tingkat; i++) {
            // Loop untuk mencetak angka pada setiap tingkat
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak angka pada tingkat tertentu
        }
    }
}




