/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Persegi extends BangunDatar{
    double sisi = 4;
    
   void infoPersegi(){
       System.out.println("Persegi");
   }
   void hitungLuas(){
       double luas = sisi*sisi;
       System.out.println("Luas Persegi : " + luas);
   }
   
   void hitungKeliling(){
       double keliling = sisi*4;
       System.out.println("Keliling Persegi : " + keliling + "\n");
   }
}
