/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peercobaan;

/**
 *
 * @author Elma
 */
public class OuterDemoMain {
    public static void main(String[] args) {
        //membuat object outerdemo
        OuterDemo2 outer = new OuterDemo2();
        
        //membuat objek innerdemo
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
