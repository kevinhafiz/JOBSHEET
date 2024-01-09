
import java.util.Scanner;


        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Tugas1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengambil tiga nilai ujian dari pengguna
        System.out.print("Masukkan nilai ujian pertama: ");
        float nilai1 = scanner.nextFloat();

        System.out.print("Masukkan nilai ujian kedua: ");
        float nilai2 = scanner.nextFloat();

        System.out.print("Masukkan nilai ujian ketiga: ");
        float nilai3 = scanner.nextFloat();

        // Menghitung rata-rata nilai
        float rata_rata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan nilai rata-rata
        System.out.println("Nilai rata-rata: " + rata_rata);

        // Menampilkan smiley face atau sad face berdasarkan nilai rata-rata
        if (rata_rata >= 60) {
            System.out.println(":-)");
        } else {
            System.out.println(":-(");
        }
        
        // Menutup scanner
        scanner.close();
    }
}






