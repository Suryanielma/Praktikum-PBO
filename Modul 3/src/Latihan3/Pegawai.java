/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Elma
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    void Pegawai(String nama, int nip, double gaji){
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" + "NIP : " + nip + "\n" +
                           "Gaji : " + gaji + "\n");
    }
    
    public static void main(String[] args){
        Pegawai Ahmad = new Pegawai();
        Ahmad.Pegawai("Ahmad", 1234567, 505000);
        Pegawai Aisyah = new Pegawai();
        Aisyah.Pegawai("Aisyah", 1234568, 200000);
        Pegawai Rahman = new Pegawai();
        Rahman.Pegawai("Rahman", 1234569, 300000);
        Pegawai Yudi = new Pegawai();
        Yudi.Pegawai("Yudi", 1234570, 4000000);
        Pegawai Jamal = new Pegawai();
        Jamal.Pegawai("Jamal", 1234571, 500000);  
     }     
}
