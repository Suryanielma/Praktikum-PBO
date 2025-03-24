/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Kubus extends BangunRuang {
    int sisi = 8;
    
    public int volume(){
        return sisi * sisi *sisi;
    }
    
    public int luasPermukaan(){
        return 6 * (sisi*sisi);
    }
}
