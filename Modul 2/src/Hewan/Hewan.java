/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Elma
 */
public class Hewan {
    String namaHewan;
    int jumlahKaki;
    String makanan;
    String typeHewan;
    
void nameHewan(String nama){
    namaHewan = nama;
}
void jmlKaki(int kaki){
    jumlahKaki = kaki;
}

void makanannya(String makananHewan){
    makanan = makananHewan;
}

void jenisHewan(String type){
    typeHewan = type;
}

void infoHewan(){
    System.out.println(
    "Nama Hewan : " + namaHewan + "\n" +
    "Jumlah Kaki : " + jumlahKaki + "\n" +
    "Makanan :" + makanan + "\n" +
    "Type Hewan : " + typeHewan + "\n");
}
}