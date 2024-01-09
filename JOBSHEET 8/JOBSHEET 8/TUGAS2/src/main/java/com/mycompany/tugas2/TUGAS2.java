/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

import javax.swing.JOptionPane;

/**
 *
 * By_Jihan salsabila_22343090
 */
public class TUGAS2 {

   public static void main(String[] args) {
        // Mendeklarasikan array untuk menyimpan 10 nomor
        double[] numbers = new double[10];

        // Mengambil 10 nomor dari pengguna
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            
            try {
                numbers[i] = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukan tidak valid. Harap masukkan angka.");
                i--; // Mengulang iterasi jika input tidak valid
            }
        }

        // Mencari nomor terbesar dalam array
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Menampilkan nomor terbesar kepada pengguna
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + max);
    }
}