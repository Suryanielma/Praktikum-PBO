/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Elma
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;
    
    public Buku(String namaPengarang, String judulBuku){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;    
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit,
        int cetakanKe){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;  
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit,
        int cetakanKe, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;  
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    
    public void tampilkanInfoBuku(){
        System.out.println("Informasi Buku" + "\n" + "Nama Pengarang: " + namaPengarang
        + "\n" + "Judul Buku: " + judulBuku + "\n" + "Tahun Terbit: " + tahunTerbit
        + "\n" + "Cetakan Ke: " + cetakanKe + "\n" + "Harga Jual: " + hargaJual +"\n");
    }
    
    public static void main(String[] args) {
        Buku book1 = new Buku("Aiyra", "Rumah penuh kebahagiaan", 2024, 1, 150.000 );
        Buku book2 = new Buku("Tere Liye", "Tentang Kamu", 2010, 30, 50.000);
        Buku book3 = new Buku("Pramoedya Ananta Toer", "Bumi Manusia", 1980, 50, 120.000);
        Buku book4 = new Buku("Fiersa Besari", "Senja di Telapak Tangan", 2016, 20, 80.000);
        Buku book5 = new Buku("Habiburrahman El Shirazy", "Ayat-Ayat Cinta", 2002, 100, 100.000);
        Buku book6 = new Buku("Andrean Hirata", "Laskar Pelangi", 2005, 40, 85.000);
        Buku book7 = new Buku("Ahmad Fuadi", "Negeri 5 menara", 2009, 25, 95.000);
        Buku book8 = new Buku("Dee Lestari", "Perahu Kertas", 2009, 20, 90.000);
        Buku book9 = new Buku("Iqbal Aji Daryono", "Nanti Kita Cerita Tentang Hari Ini", 2018, 12, 80.000);
        Buku book10 = new Buku("Leila S. Chudori", "Pulang", 2012, 15, 95.000);
        
        book1.tampilkanInfoBuku();
        book2.tampilkanInfoBuku();
        book3.tampilkanInfoBuku();
        book4.tampilkanInfoBuku();
        book5.tampilkanInfoBuku();
        book6.tampilkanInfoBuku();
        book7.tampilkanInfoBuku();
        book8.tampilkanInfoBuku();
        book9.tampilkanInfoBuku();
        book10.tampilkanInfoBuku();
    } 
}
