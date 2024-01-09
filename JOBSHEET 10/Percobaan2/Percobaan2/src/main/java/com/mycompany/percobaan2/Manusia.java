/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percobaan2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner; 

public class Manusia {
    String nama, tempatLahir, tglLahir;  // Corrected variable names

    int beratBadan, tinggiBadan;  // Corrected variable names

    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama lengkap\t: ");
        nama = input.nextLine();

        System.out.print("Masukan tempat lahir\t: ");
        tempatLahir = input.nextLine();  // Corrected variable name

        System.out.print("Masukan tanggal lahir\t: ");
        tglLahir = input.nextLine();  // Corrected variable name

        System.out.print("Masukan Berat Badan\t: ");
        beratBadan = input.nextInt();

        System.out.print("Masukan Tinggi Badan\t: ");
        tinggiBadan = input.nextInt();
    }

    public void identitas() {
        System.out.println("Nama saya \t: " + nama);
        System.out.println("Tempat lahir \t: " + tempatLahir);  // Corrected variable name
        System.out.println("Tanggal lahir \t: " + tglLahir);  // Corrected variable name
        System.out.println("Berat Badan \t: " + beratBadan + " kg");
        System.out.println("Tinggi Badan \t: " + tinggiBadan + " cm");
    }

    public static void main(String[] args) {
        Manusia A = new Manusia();

        A.inputData();
        A.identitas();
    }
}
