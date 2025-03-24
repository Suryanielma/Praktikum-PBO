/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama : ");
        JLabel password = new JLabel("Passsword : ");
        JTextField inputnama = new JTextField(15);
        JPasswordField inputpsw = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputnama);
        panel.add(password);
        panel.add(inputpsw);
        u.add(panel);
    }
    
}
