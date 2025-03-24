/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        BankPasar bp = new BankPasar();
        BankPribadi bpr = new BankPribadi();
        BankSyariah bs = new BankSyariah();
        BankUmum bu = new BankUmum();
        
        System.out.println("Rasio Bunga Bank: " + b.rasioBunga());
        System.out.println("Rasio Bunga Bank Pasar: " + bp.rasioBunga());
        System.out.println("Rasio Bunga Bank Pribadi: " + bpr.rasioBunga());
        System.out.println("Rasio Bunga Bank Syariah: " + bs.rasioBunga());
        System.out.println("Rasio Bunga Bank Umum: " + bu.rasioBunga());
    }
}

