/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
public class Pesawat extends Kendaraan{
    int kapasitas = 150;
    double harga = 1500000;
    
    public void infoPesawat(){
        System.out.println("Pesawat");
        System.out.println( 
        "Tahun Pembuatan : " + tahun + "\n" +
        "Kapasitas Kendaraan : " + kapasitas + "\n" +
        "Harga Tiket : " + harga + "\n");
    } 
}
