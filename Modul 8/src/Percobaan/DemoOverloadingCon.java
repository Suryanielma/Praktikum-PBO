/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
public class DemoOverloadingCon {
    public static void main(String[] args) {
        // Memanggil konstruktor tanpa parameter
        OverloadingConstructor user1 = new OverloadingConstructor();
        
        // Memanggil konstruktor dengan parameter
        OverloadingConstructor user2 = new OverloadingConstructor(252, "Elma");
        
        // Menampilkan informasi user2
        System.out.println("ID User: " + user2.idUser);
        System.out.println("Username: " + user2.userName);
    }
}


