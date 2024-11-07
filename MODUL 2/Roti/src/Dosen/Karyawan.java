/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author Elma
 */
public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;
    
void tampilkanNama(String namaKaryawan){
    nama = namaKaryawan;
    System.out.println("Nama Karyawan : " + nama);
}

void tampilkanAlamat(String alamatKaryawan){
    alamat = alamatKaryawan;
    System.out.println("Alamat : " + alamat);
}

void tampilkanJabatan(String jabatanKaryawan){
    jabatan = jabatanKaryawan;
    System.out.println("Jabatan di perusahaan : " + jabatan);
}

void tampilkanGaji(double gajiKaryawan){
    gaji = gajiKaryawan;
    System.out.println("Gaji dalam satu bulan : " + gaji + " " + "Rupiah");
}
}
