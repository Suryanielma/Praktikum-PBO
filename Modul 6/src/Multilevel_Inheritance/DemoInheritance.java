/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multilevel_Inheritance;

/**
 *
 * @author Elma
 */
public class DemoInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.MessageA();
        b.MessageB();
        b.MessageA();
        c.MessageC();
        c.MessageB();
        c.MessageA();
    }
}
