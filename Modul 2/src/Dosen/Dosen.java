/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author Elma
 */
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahir;
    
void tampilkanNama(String namaDosen){
    nama = namaDosen;
    System.out.println("nama Dosen : " + nama);
}

void tampilkanNik(int nikDosen){
    nik = nikDosen;
    System.out.println("Nik Dosen : " + nik);
}

void tampilkanPendidikan(String pendidikanDosen){
    pendidikan = pendidikanDosen;
    System.out.println("Pendidikan Dosen : " + pendidikan);
}

void tampilkantglLahir(String tglLahirDosen){
    tglLahir = tglLahirDosen;
    System.out.println("Tanggal Lahir Dosen : " + tglLahir);
}
}
