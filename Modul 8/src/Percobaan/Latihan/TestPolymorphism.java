/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan.Latihan;

/**
 *
 * @author Elma
 */
public class TestPolymorphism {
     public static void main(String[] args){
        Kucing tom = new Kucing();
        tom.beriNama("Tom");
        System.out.println(tom.panggilNama());
        System.out.println(tom.perilaku());
        System.out.println(tom.suara() + "\n");

        Anjing bull = new Anjing();
        bull.beriNama("Bull");
        System.out.println(bull.panggilNama());
        System.out.println(bull.perilaku());
        System.out.println(bull.suara());
    }
}