/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

/**
 *
 * By_Jihan salsabila_22343090
 */
public class TUGAS3 {

     public static void main(String[] args) {
        String[][] entries = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        for (int i = 0; i < entries.length; i++) {
            String name = entries[i][0];
            String phoneNumber = entries[i][1];
            String address = entries[i][2];

            System.out.println("Name : " + name);
            System.out.println("Tel. # : " + phoneNumber);
            System.out.println("Address : " + address);
            System.out.println();
        }
    }
}