/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class CustomerData {
    String nama, alamat, tanggalLahir, pekerjaan;
    double gaji;
    
    public CustomerData(){
        
    }

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }
    
    public void print(){
        System.out.println("Nama:" + nama);
        System.out.println("Alamat:" + alamat);
        System.out.println("Tanggal Lahir:" + tanggalLahir);
        System.out.println("Pekerjaan:" + pekerjaan);
        System.out.println("Gaji:" + gaji);
        System.out.println(" ");
    }
}
