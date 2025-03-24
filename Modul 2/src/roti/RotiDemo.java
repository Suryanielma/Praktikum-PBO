/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

/**
 *
 * @author Elma
 */
public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();
        
        Roti rotiBakery = new Roti();
        rotiBakery.beriWarna("Coklat");
        rotiBakery.beriRasa("Bluberry");
        rotiBakery.timbangBerat(28);
        rotiBakery.hargaJual(10000);
        rotiBakery.infoRoti();
        
        Roti rotiCromboloni = new Roti();
        rotiCromboloni.beriWarna("Cream");
        rotiCromboloni.beriRasa("Tiramisu");
        rotiCromboloni.timbangBerat(30);
        rotiCromboloni.hargaJual(15000);
        rotiCromboloni.infoRoti();
        
        Roti rotiBagel = new Roti();
        rotiBagel.beriWarna("Putih");
        rotiBagel.beriRasa("Strawberry");
        rotiBagel.timbangBerat(25);
        rotiBagel.hargaJual(18000);
        rotiBagel.infoRoti();
    }
}