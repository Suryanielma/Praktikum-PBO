/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Balok extends BangunRuang{
    int panjang = 4;
    int lebar = 2;
    int tinggi = 5;
    
    public int volume(){
        return panjang*tinggi*lebar;
    }
    
    public int luasPermukaan(){
        return 2 * (panjang*lebar + panjang*lebar + lebar*tinggi);
    }
}
