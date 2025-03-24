/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public abstract class  BangunRuang {
    public abstract int volume();
    public abstract int luasPermukaan();
    
    public int getVolume(){
        return volume();
    }
    
    public int getLuasPermukaan(){
        return luasPermukaan();
    }
}
