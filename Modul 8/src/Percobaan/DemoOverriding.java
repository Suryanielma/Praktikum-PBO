/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
public class DemoOverriding {
    public static void main(String[] args) {
        Parentclaz pc = new Parentclaz();
        Childclaz cd = new Childclaz();
        pc.printOut();
        cd.printOut();
        cd.hello();
    }
}
