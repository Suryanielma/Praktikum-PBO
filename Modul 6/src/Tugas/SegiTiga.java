/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class SegiTiga extends BangunDatar{
    double alas = 5;
    double tinggi = 5;

   void infoSegiTiga(){
       System.out.println("Segi Tiga");
   }
   
    void hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 3 * alas;
        System.out.println("Keliling Segitigas : " + keliling + "\n");
    }
}
