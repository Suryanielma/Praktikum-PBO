/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
public class DemoComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,100);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi"
                                  +" Objek jelas dan mudah");
        String[] Options = {"Sangat tidak setuju", "Tidak setuju", 
                            "Kurang setuju", "Setuju", "Sangat setuju"};
        JComboBox<String> ComboBox = new JComboBox(Options);
        
        panel.add(label);
        panel.add(ComboBox);
        frame.add(panel);
        frame.setVisible(true);
    }
}
