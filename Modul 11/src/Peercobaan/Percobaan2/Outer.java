/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peercobaan.Percobaan2;

/**
 *
 * @author Elma
 */
public class Outer {
    static class NestedDemo{
        public void myMethod(){
            System.out.println("Ini adalah method" + "Static nested class");
        }
    }
    
    public static void main(String[] args){
        Outer.NestedDemo nested = new Outer.NestedDemo();
        nested .myMethod();
    }
}
