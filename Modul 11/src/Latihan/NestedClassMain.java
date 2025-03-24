/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
public class NestedClassMain {
    public static void main (String[]args){
        NestedClass.StaticNestedClass SN =new NestedClass.StaticNestedClass();
        SN.printInfo();
        NestedClass.InnerClass IN = new NestedClass().new InnerClass();
        IN.Info();
    }
}
