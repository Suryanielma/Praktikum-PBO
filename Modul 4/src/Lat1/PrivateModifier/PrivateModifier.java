/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat1.PrivateModifier;

/**
 *
 * @author Elma
 */
public class PrivateModifier {
    private String nama = "Elma";
    private int umur;
    
    
    public void printInfo(){
        System.out.println("private modifier");
    }
       
    private void panggilNama(){
        System.out.println(this.nama);
}
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        pm.printInfo();
        pm.panggilNama();
    }
}
