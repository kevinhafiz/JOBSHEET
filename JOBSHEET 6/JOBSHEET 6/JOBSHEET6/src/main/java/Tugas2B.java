
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Tugas2B {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengambil angka sebagai input dari pengguna
        System.out.print("Masukkan angka antara 1 hingga 10: ");
        int angka = scanner.nextInt();

        // Mengonversi angka menjadi kata menggunakan switch-case
        String kata;
        switch (angka) {
            case 1:
                kata = "Satu";
                break;
            case 2:
                kata = "Dua";
                break;
            case 3:
                kata = "Tiga";
                break;
            case 4:
                kata = "Empat";
                break;
            case 5:
                kata = "Lima";
                break;
            case 6:
                kata = "Enam";
                break;
            case 7:
                kata = "Tujuh";
                break;
            case 8:
                kata = "Delapan";
                break;
            case 9:
                kata = "Sembilan";
                break;
            case 10:
                kata = "Sepuluh";
                break;
            default:
                kata = "Invalid number";
                break;
        }

        // Menampilkan kata yang sesuai atau "Invalid number"
        System.out.println("Angka dalam kata (switch-case): " + kata);

        // Menutup scanner
        scanner.close();
    }
}

   
