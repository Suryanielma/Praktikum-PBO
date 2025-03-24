/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Elma
 */
public class JajarGenjang extends MethodAbstrak {
    int alas = 6;
    int tinggi = 3;
    int sisiMiring = 4;

    public int luas(){
        return alas * tinggi;
    }

    public int keliling(){
        return 2 * (alas + sisiMiring);
    }
}
