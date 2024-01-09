/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class TestOR {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;

        // Demonstrasi ||
        test = (i > j) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        // Demonstrasi |
        test = (i > j) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
