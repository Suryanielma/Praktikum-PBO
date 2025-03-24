/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
public class Mobil extends Kendaraan{
    int kapasitas = 4;
    String merk = "Lamborgini";
    
    public void infoMobil(){
        System.out.println("Mobil");
        System.out.println(
        "Negara Pembuatan : " + negara + "\n" + 
        "Kapasitas Kendaraan : " + kapasitas + "\n" +
        "Merk Mobil : " + merk + "\n");
    } 
}
