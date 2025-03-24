/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class MainBangunRuang {
    public static void main(String[] args) {
        Balok balok = new Balok();
        System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
        System.out.println("Volume Balok: " + balok.volume() + "\n");
        
        Kubus kubus = new Kubus();
        System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
        System.out.println("Volume Kubus: " + kubus.volume() + "\n");
        
        Bola bola = new Bola();
        System.out.println("Luas Permukaan Bola: " + bola.luasPermukaan());
        System.out.println("Volume Bola: " + bola.volume() + "\n");
        
        Kerucut kerucut = new Kerucut();
        System.out.println("Luas Permukaan Kerucut: " + kerucut.luasPermukaan());
        System.out.println("Volume Kerucut: " + kerucut.volume() + "\n");
        
        PrismaSegiTiga ps = new PrismaSegiTiga();
        System.out.println("Luas Permukaan Prisma Segitiga: " + ps.luasPermukaan());
        System.out.println("Volume Prisma Segitiga: " + ps.volume()); 
    }
}
