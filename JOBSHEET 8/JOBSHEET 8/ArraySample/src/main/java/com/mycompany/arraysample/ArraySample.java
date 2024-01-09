/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample;

/**
 *
 * @author ASUS
 */
public class ArraySample {

    public static void main(String[] args) {
       int[] ages = new int[100];
        
        // Inisialisasi array ages dengan nilai tertentu
        for (int i = 0; i < 100; i++) {
            ages[i] = i + 1; // Contoh: Inisialisasi dengan angka dari 1 hingga 100
        }

        // Mencetak nilai dari array ages
        for (int i = 0; i < 100; i++) {
            System.out.println(ages[i]);
        }
    }
}