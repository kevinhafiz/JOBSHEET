
import java.util.Scanner;
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
public class TUGAS1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter word1: ");
            String word1 = reader.readLine();
            
            System.out.print("Enter word2: ");
            String word2 = reader.readLine();
            
            System.out.print("Enter word3: ");
            String word3 = reader.readLine();
            
            System.out.println(word1 + " " + word2 + " " + word3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

   
