/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
import java.net.URL;
import javax.swing.ImageIcon;;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;
public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500,500);
        URL img = FrameB.class.getResource("Labubu.jpg");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}
