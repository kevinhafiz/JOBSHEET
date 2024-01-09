
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class BufferedReader1 {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        
        String a ,b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Bilangan");

        try {
            System.out.print("Masukkan angka pertama: ");
            a = datain.readLine();
            angka1 = Float.parseFloat(a); // Konversi dari string ke float

            System.out.print("Masukkan angka kedua: ");
            b = datain.readLine();
            angka2 = Float.parseFloat(b); // Konversi dari string ke float

            jumlah = angka1 + angka2;
            System.out.println("Jumlah: " + jumlah);
        } catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }
    }
}
    
