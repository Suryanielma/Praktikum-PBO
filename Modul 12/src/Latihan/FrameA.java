/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
import java.awt.Container;
import javax.swing.JButton;
public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super("Frame dan Button");
        setSize(100,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtOK = new JButton("OK");
        kontainer.add(jbtOK);
    }
}
