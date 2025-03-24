/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Elma
 */
public class HewanDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.nameHewan("Harimau");
        hewan1.jmlKaki(4);
        hewan1.makanannya("Daging");
        hewan1.jenisHewan("Karnivora");
        hewan1.infoHewan();
        
        Hewan hewan2 = new Hewan();
        hewan2.nameHewan("Kerbau");
        hewan2.jmlKaki(4);
        hewan2.makanannya("Rumput");
        hewan2.jenisHewan("Herbivora");
        hewan2.infoHewan();        
    }
}
