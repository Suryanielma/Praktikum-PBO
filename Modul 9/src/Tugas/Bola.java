/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Bola extends BangunRuang{
    int jari = 4;
    
    public int volume(){
        return (int) (4/3 * 3.14 * jari * jari * jari);
    }
    
    public int luasPermukaan(){
        return (int)(4 * 3.14 * jari * jari);
    }
}
