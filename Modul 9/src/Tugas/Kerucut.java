/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Kerucut extends BangunRuang{
    int jari = 4;
    int tinggi = 8;
    
    public int volume(){
        return (int) (1.0/3 * 3.14 * jari * jari * jari * tinggi);
    }
    
    public int luasPermukaan(){
        double sisiMiring = 3.14 * (jari * jari + tinggi * tinggi);
        return (int)(3.14 * jari * (jari + sisiMiring));
    }
}
