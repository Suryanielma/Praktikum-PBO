/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekening;

/**
 *
 * @author Elma
 */
public class Rekening{
    int saldo;
    int no_rekening;
    String nama;
    
void beriSaldo (int saldoku){
    saldo = saldoku;
}
    
void beriNoRek (int no_rekku){
    no_rekening = no_rekku;
}

void berinama (String namaku){
    nama = namaku;
}

void cek_saldo (){
    System.out.println("Saldo anda adalah " + saldo);
}

void menabung(int jumlahUang){
    saldo = saldo + jumlahUang;
    System.out.println("saldo anda sekarang adalah " + saldo);
}

void menarik(int jumlahTarik){
    saldo = saldo - jumlahTarik;
    System.out.println("saldo anda sekarang " + saldo);
}

void transfer(int jumlahtf, int no_reknya){
    saldo = saldo - jumlahtf;
            System.out.println("Anda sudah mentransfer sebanyak " + jumlahtf + 
            " ke no rekening : " + "\n" + no_reknya + "\n" + 
            "saldo anda sekarang adalah " + saldo);
}
}
