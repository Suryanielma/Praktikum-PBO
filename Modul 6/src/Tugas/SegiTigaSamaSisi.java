/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class SegiTigaSamaSisi extends SegiTiga {
    double sisi = alas;

   void infoSegiTigaSamaSisi(){
       System.out.println("Segitiga Sama Sisi");
   }
       
    void hitungLebar(){
        double luas = 0.5 * sisi * tinggi;
        System.out.println("Luas Segitiga Sama Sisi : " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 3 * sisi;
        System.out.println("Keliling Segitiga Sama Sisi : " + keliling + "\n");
    }
}
