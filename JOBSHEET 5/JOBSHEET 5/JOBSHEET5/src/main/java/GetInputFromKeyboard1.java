
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
public class GetInputFromKeyboard1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "", hobby = "";

        try {
            System.out.print("Nama Anda: ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda: ");
            hobby = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }

        System.out.println("Jadi Anda " + hobby + ". Hobi yang bagus " + name);
    }
}
