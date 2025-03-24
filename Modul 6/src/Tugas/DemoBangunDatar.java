/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class DemoBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.infoPersegi();
        p.hitungLuas();
        p.hitungKeliling();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.infoPersegiPanjang();
        pp.hitungLuas();
        pp.hitungKeliling();
        
        SegiTiga st = new SegiTiga();
        st.infoSegiTiga();
        st.hitungLuas();
        st.hitungKeliling();
        
        SegiTigaSamaSisi sts = new SegiTigaSamaSisi();
        sts.infoSegiTigaSamaSisi();
        sts.hitungLebar();
        sts.hitungKeliling();
        
        SegiTigaSembarang sts2 = new SegiTigaSembarang();
        sts2.infoSegiTigaSembarang();
        sts2.hitungLuas();
        sts2.hitungKeliling();
    } 
}
