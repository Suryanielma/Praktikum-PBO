/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author Elma
 */
public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    
void tampilkanNama(String namaMahasiswa){
    nama = namaMahasiswa;
    System.out.println("Nama Mahasiswa : " + nama);
}

void tampilkanNim(String nimMahasiswa){
    nim = nimMahasiswa;
    System.out.println("NIM Mahasiswa : " + nim);
}

void tampilkanAlamat(String alamatMahasiswa){
    alamat = alamatMahasiswa;
    System.out.println("Alamat Mahasiswa : " + alamat);
}

void tampilkanSemester(int semesterMahasiswa){
    semester = semesterMahasiswa;
    System.out.println("Semester : " + semester);
}
}
