/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;
import java.util.Scanner;

/**
 *
 * @author Elma
 */
public class AplikasiLampu {
    public static void main(String[] args){
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status lampu = " + lampu.statusLampu + "\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu\n4 untuk meredupkan lampu");
        
        if(lampu.setSaklar(sc.nextInt()) == 0){
            lampu.matikanLampu();  
        if(lampu.setSaklar(sc.nextInt()) == 1)
            lampu.hidupkanLampu();
        }
        else{
            lampu.redupkanLampu();
        }
    }
}
