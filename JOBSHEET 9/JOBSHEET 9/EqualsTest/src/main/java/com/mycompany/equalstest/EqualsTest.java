/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equalstest;

/**
 *
 * @author ASUS
 */
public class EqualsTest {

    public static void main(String[] args) {
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;
        
        // Memeriksa apakah str1 dan str2 adalah objek yang sama
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        str2 = new String(str1);
        
        // Memeriksa apakah str1 dan str2 adalah objek yang sama setelah str2 dibuat ulang
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        // Memeriksa apakah str1 dan str2 memiliki nilai yang sama
        System.out.println("Same value? " + str1.equals(str2));
    }
}







