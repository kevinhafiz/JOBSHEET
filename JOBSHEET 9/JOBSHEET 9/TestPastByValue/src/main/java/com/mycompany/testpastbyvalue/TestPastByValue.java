package com.mycompany.testpastbyvalue;

public class TestPastByValue {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        i = test(i); // Memanggil metode test dan menyimpan hasilnya kembali ke i
        System.out.println(i);
    }
    
    public static int test(int j) { // Mengubah tipe data metode menjadi int dan mengembalikan nilai
        j = 33;
        return j; // Mengembalikan nilai j yang telah diubah
    }
}
