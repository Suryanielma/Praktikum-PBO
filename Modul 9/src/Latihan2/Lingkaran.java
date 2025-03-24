/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Elma
 */
public class Lingkaran extends MethodAbstrak  {
    int jari = 6;

    public int luas(){
        return (int) (3.14 * jari * jari);
    }

    public int keliling(){
        return (int) (2 * 3.14 * jari);
    }
}
