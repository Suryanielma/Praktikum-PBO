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
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class DemoMenu extends JFrame implements ActionListener{
    JFrame a;
    JMenuItem red, yellow, green;
    JMenuBar Menu;
    JMenu WarnaMenu;
    
    public DemoMenu(){
        a = new JFrame("PENGUBAH WARNA");
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
        a.setSize(1000, 100);
        a.setLocationRelativeTo(null);
        a.setLayout(null);
        a.setVisible(true);
        
        Menu = new JMenuBar();
        a.setJMenuBar(Menu);
        
        WarnaMenu = new JMenu("Ubah Warna");
        WarnaMenu.setMnemonic(KeyEvent.VK_R);
        Menu.add(WarnaMenu);
        
        red = new JMenuItem("Merah");
        yellow = new JMenuItem("Kuning");
        green = new JMenuItem("Hijau");
        
        WarnaMenu.add(red);
        WarnaMenu.add(yellow);
        WarnaMenu.add(green);
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
    }
                
    public void actionPerformed(ActionEvent b){
        if(b.getSource()==red)
            a.getContentPane().setBackground(Color.red);
        else if(b.getSource()==yellow)
            a.getContentPane().setBackground(Color.yellow);
        else if(b.getSource()==green)
            a.getContentPane().setBackground(Color.green);   
    }
    
    public static void main(String[] args) {
        DemoMenu dm = new DemoMenu();
    }
                
}