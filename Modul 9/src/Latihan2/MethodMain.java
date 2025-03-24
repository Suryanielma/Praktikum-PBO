/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Elma
 */
public class MethodMain {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling() + "\n");
        
        JajarGenjang jg = new JajarGenjang();
        System.out.println("Luas Jajar Genjang: " + jg.luas());
        System.out.println("Keliling Jajar Genjang: " + jg.keliling() + "\n");
        
        Lingkaran l = new Lingkaran();
        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("Keliling Lingkaran: " + l.keliling() + "\n");
        
        SegiTiga st = new SegiTiga();
        System.out.println("Luas Segitiga: " + st.luas());
        System.out.println("Keliling Segitiga: " + st.keliling());
        
        
    }
}
