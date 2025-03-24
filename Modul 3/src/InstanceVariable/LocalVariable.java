/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstanceVariable;

/**
 *
 * @author Elma
 */
public class LocalVariable {
    int umur = 19;
    public void hitungUsia(){
        int usia = 0; //usi local variable
        int tahunSekarang = 2024;
        int tahunLahir = 2005;
        umur = tahunSekarang - tahunLahir;
        
        System.out.println("Usia saya sekarang : " + usia);
    }
    
    public void beratBadan(){
       int beratBadan = 0;
       beratBadan = umur/2;
       
       System.out.println("Berat badan saya : " + beratBadan);
    }
    
    public static void main(String[] args) {
        LocalVariable cek = new LocalVariable();
        cek.hitungUsia();
        cek.beratBadan();
    }
}
