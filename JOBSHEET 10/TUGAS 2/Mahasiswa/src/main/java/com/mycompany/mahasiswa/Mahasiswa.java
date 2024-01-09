/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

import java.util.Scanner;

/**
 *CREATED BY _
 */

public class Mahasiswa {
    String nama;
    int nim;
    String semester;
    double ip;

    // Constructor
    public Mahasiswa(String nama, int nim, String semester, double ip) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ip = ip;
    }

    // Method to determine the number of SKS based on IP
    public int hitungSKS() {
        if (ip >= 3.5) {
            return 24;
        } else if (ip >= 3.0) {
            return 22;
        } else if (ip >= 2.5) {
            return 20;
        } else if (ip >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Semester: " + this.semester);
        System.out.println("IP Semester ini: " + this.ip);
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nama Mahasiswa: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            int nim = input.nextInt();
            input.nextLine(); // Consume the newline

            System.out.print("Semester: ");
            String semester = input.nextLine();

            System.out.print("IP Semester ini: ");
            double ip = input.nextDouble();

            // Create an instance of Mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, semester, ip);

            // Display information
            mahasiswa.displayInfo();

            // Calculate and display the number of SKS
            int sks = mahasiswa.hitungSKS();
            System.out.println("Anda berhak mengontrak " + sks + " SKS pada Semester " + mahasiswa.semester);
        }
    }
}
    
