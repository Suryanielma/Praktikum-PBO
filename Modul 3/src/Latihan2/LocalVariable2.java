/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author LENOVO
 */
public class LocalVariable2 {
    int umur;
    public void hitungUsia(){
        int usia = 0; //usi local variable
        int tahunSekarang = 2024;
        int tahunLahir = 2005;
        usia = tahunSekarang - tahunLahir;
        umur = usia;
        
        System.out.println("Usia Elma sekarang : " + usia);
    }
    
    void beratBadan(){
       int beratBadan = 0;
       beratBadan = umur/2;
       
       System.out.println("Berat badan Elma : " + beratBadan);
    }
    
    public static void main(String[] args) {
        LocalVariable2 cek = new LocalVariable2();
        cek.hitungUsia();
        cek.beratBadan();
    }
}

