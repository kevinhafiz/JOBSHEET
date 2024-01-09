/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugascasesensitive;

/**
 *
 * @author ASUS
 */
public class Tugascasesensitive {

    public static void main(String[] args) {
        // ini adalah baris komentar
        
        // deklarasi variabel dengan tipe nama "data"
        int data = 10;
        
        // deklarasi variabel dengan tipe nama "Data" ( beda huruf besar - keceil )
        int Data = 10;
        
        /* deklarasi variabel dengan tipe nama "DATA" ( penambahan tipe variabel supaya ketika
            program dijalankan tidak mengalami error ketika di compile
        */
        int DATA = 10;
        
        // baris berikutnya mencetak nilai variabel "data" ke ke layar
        System.out.println("Nilai variabel data :" + data);
        
        // baris berikutnya mecnetak nilai variabel "Data" ke layar
        System.out.println("Nilai variabel Data :" + Data);
        
        // baris berikutnya mecnetak nilai variabel "DATA" ke layar
        // penambahan supaya tidak mengalami error ketika di compile
        System.out.println("Nilai variabel Data :" + DATA);
        
        
        // baris berikutnya mencoba mencetak nilai variabel "Data" ( tidak ada masalah )
        System.out.println("Nilai variabel Data :" + Data);
        
        // penambahan supaya tidak mengalami error ketika di compile
        System.out.println("Nilai variabel DATA :" + DATA);
        
        // baris berikutnya mencoba mencetak nilai variabel "data" ( tidak ada masalah )
        System.out.println("Nilai variabel Data :" + data);
        
        // baris berikutnya mencoba mencetak nilai variabel "Data" ) huruf besar semua )
        // ini akan menghasilkan error karena tidak ada variabel "DATA" yang dideklarasikan
        // dan cara supaya tidak error kita harus menambahkan tipe nama berupa "DATA" kedalam variabel
        // java sangat case-sensitive, jadi "DATA" dan "data" dianggap berbeda
        System.out.println("Nilai variabel DATA :" + DATA);
        
        /* program bisa berjalan diakrenakan tipe nama DATA yang awal tidak dideklarasi
        di dalam variabel ditambahkan kedalam variabel maka dari itu program dapat berjalan
        dengan lanjar tanpa ERROr dikarenakan kita menambahkan tipe nama variabel tambahan
        yaitu "DATA"
        */
    }
}
