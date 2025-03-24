/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
public class DemRadioButton {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(1000,100);
        
        JRadioButton[] teams = new JRadioButton[5];
        teams [0] = new JRadioButton("Sangat tidak setuju");
        teams [1] = new JRadioButton("Tidak setuju");
        teams [2] = new JRadioButton("Kurang setuju");
        teams [3] = new JRadioButton("Setuju", true);
        teams [4] = new JRadioButton("Sangat setuju");
        JPanel panel = new JPanel();
        JLabel Pernyataan = new JLabel("Modul Praktikum Pemrograman Berorientasi "
                                        + "Objek jelas dan mudah.");
        panel.add(Pernyataan);
        
        ButtonGroup group = new ButtonGroup();
        for(int i = 0; i<teams.length; i++){
            group.add(teams[i]);
            panel.add(teams[i]);
        }
        
        u.add(panel);
        u.setVisible(true);
    }
}