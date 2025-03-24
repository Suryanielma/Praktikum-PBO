/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class PersegiPanjang extends BangunDatar {
    int panjang = 20;
    double lebar = 7;
    
   void infoPersegiPanjang(){
       System.out.println("Persegi Panjang");
   }
   
    void hitungLuas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling : " + keliling + "\n");
    }
}