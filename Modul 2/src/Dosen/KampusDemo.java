/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;


/**
 *
 * @author Elma
 */
public class KampusDemo {
    public static void main(String[] args) {
            Dosen dosen = new Dosen();
            dosen.tampilkanNama("Elma");
            dosen.tampilkanNik(12345);
            dosen.tampilkanPendidikan("S1");
            dosen.tampilkantglLahir("10-02-2005");
            
            Karyawan karyawan =  new Karyawan();
            karyawan.tampilkanNama(" Aiyra");
            karyawan.tampilkanAlamat("Bumiayu Brebes");
            karyawan.tampilkanJabatan("HRD");
            karyawan.tampilkanGaji(9000000);
            
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.tampilkanNama("Suryani Elmaghfiroh");
            mahasiswa.tampilkanNim("L200230252");
            mahasiswa.tampilkanAlamat("Bumiayu Brebes");
            mahasiswa.tampilkanSemester(3);
    }
}
