
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name = "", hobby = "";

        name = JOptionPane.showInputDialog("Nama Anda : ");
        hobby = JOptionPane.showInputDialog("Hobi Anda : ");

        String msg = "Jadi Hobi Anda " + hobby + ". Hobi yang bagus " + name;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi Hobi Anda " + hobby + ". Hobi yang bagus " + name);
    }
}
