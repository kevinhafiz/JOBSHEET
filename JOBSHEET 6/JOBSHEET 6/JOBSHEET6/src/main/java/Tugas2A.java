
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Tugas2A {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengambil angka sebagai input dari pengguna
        System.out.print("Masukkan angka antara 1 hingga 10: ");
        int angka = scanner.nextInt();

        // Mengonversi angka menjadi kata menggunakan if-else-if
        String kata;
        if (angka == 1) {
            kata = "Satu";
        } else if (angka == 2) {
            kata = "Dua";
        } else if (angka == 3) {
            kata = "Tiga";
        } else if (angka == 4) {
            kata = "Empat";
        } else if (angka == 5) {
            kata = "Lima";
        } else if (angka == 6) {
            kata = "Enam";
        } else if (angka == 7) {
            kata = "Tujuh";
        } else if (angka == 8) {
            kata = "Delapan";
        } else if (angka == 9) {
            kata = "Sembilan";
        } else if (angka == 10) {
            kata = "Sepuluh";
        } else {
            kata = "Invalid number";
        }

        // Menampilkan kata yang sesuai atau "Invalid number"
        System.out.println("Angka dalam kata (if-else-if): " + kata);

        // Menutup scanner
        scanner.close();
    }
}
