/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kucing;

/**
 * @author Elma
 */
public class Kucing {
    int umur;
    String warnaBulu;
    
void umurnya (int umurKucing){
    umur = umurKucing;
}

void warnanya (String warnaBuluKucing){
    warnaBulu = warnaBuluKucing;
}

void meong (){
    System.out.print("Meong\n");
}

void infoKucing(){
    System.out.println(
        "Umur Kucing : " + umur + " bulan" + "\n" +
        "Warna bulu Kucing : " + warnaBulu + "\n");
}
}

