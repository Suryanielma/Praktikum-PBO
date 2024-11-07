/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekening;

/**
 *
 * @author Elma
 */
public class RekeningDemo {
     public static void main(String[] args) {
         Rekening saldo_Elma = new Rekening();
         saldo_Elma.beriSaldo(2000000);
         saldo_Elma.beriNoRek(252);
         saldo_Elma.berinama("Suryani Elmaghfiroh");
         saldo_Elma.cek_saldo();
         saldo_Elma.menabung(50000);
         saldo_Elma.menarik(100000);
         saldo_Elma.transfer(50000, 187);
     }     
}
