/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
public class SepedaAir extends Sepeda{
    void run(){
        System.out.println("Hanya bisa berjalan di atas" +" " + "air");
        
    }
    public static void main(String[] args) {
        Sepeda s = new SepedaAir(); //UPCASTING
        s.run();
    }
}
