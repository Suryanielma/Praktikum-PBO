/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author Elma
 */
public abstract class MethodAbstract {
    public abstract int luas();
    public abstract int keliling();
    
    public int getLuas(){
        return luas();
    }
    
    public int getKell(){
        return keliling();
    }
}
