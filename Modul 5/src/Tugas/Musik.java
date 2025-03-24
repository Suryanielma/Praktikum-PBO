/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class Musik {
    String nama, judulMusik;
    int tahunRilis;
    
    public Musik(){
        this.nama = "Tulus";
        this.judulMusik = "Tujuh Belas";
        this.tahunRilis = 2022;
    }
    
    public Musik(String nama, String judulMusik, int tahunRilis){
        this.nama = nama;
        this.judulMusik = judulMusik;
        this.tahunRilis = tahunRilis;
    }
    
    void infoMusik(){
        System.out.println("Nama Penyanyi:" + nama + "\n" + 
                "Judul Musik: " + judulMusik + "\n" 
                + "Tahun Rilis: " + tahunRilis + "\n");
    }
}