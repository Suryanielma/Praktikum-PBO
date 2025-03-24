/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekerjaanRumah;

/**
 *
 * @author Elma
 */
public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas; 
    double nilaiTotal;

    public void hitungNilai(double nilaiUTS, double nilaiUAS, double nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
        this.nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }
    
    public double getNilaiUAS() {
        return nilaiUAS;
    }
    public double getNilaiTugas() {
        return nilaiTugas;
    }
    
    public double getNilaiTotal() {
        return nilaiTotal;
    }
    
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.hitungNilai(92.0, 95.0, 88.0);
        
        //mengambil nilai
        double nilaiUTS = nilai.getNilaiUTS();
        double nilaiUAS = nilai.getNilaiUAS();
        double nilaiTugas = nilai.getNilaiTugas();
        double nilaiTotal = nilai.getNilaiTotal();
        
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Total: " + nilaiTotal);
    }
}