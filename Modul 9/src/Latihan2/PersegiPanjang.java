/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Elma
 */
public class PersegiPanjang extends MethodAbstrak {
    int panjang = 5;
    int lebar = 3;
    
    public int luas(){
        return panjang * lebar;
    }
    
    public int keliling(){
        return 2 * (panjang + lebar);  
    }
}
