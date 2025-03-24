/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class SegiTigaSembarang extends SegiTiga {
    double sisiMiring = 7;

   void infoSegiTigaSembarang(){
       System.out.println("Segitiga Sembarang");
   }
   
    void hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga Sembarang : " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 2 * alas + sisiMiring;
        System.out.println("Keliling Segitiga Sembarang : " + keliling);
    }
}
