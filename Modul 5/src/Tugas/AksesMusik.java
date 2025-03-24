/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class AksesMusik {
    public static void main(String[] args) {
        Musik musik = new Musik();
        Musik musik1 = new Musik("Sheila on 7",  "Kisah klasik", 2000);
        
        musik.infoMusik();
        musik1.infoMusik();
    }
}
