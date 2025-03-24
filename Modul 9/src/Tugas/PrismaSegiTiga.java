/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class PrismaSegiTiga extends BangunRuang{
    int alas = 4;
    int kelAlas = 10;
    int tingSegiTiga = 5;
    int tinggiPrisma = 3;

    public int volume(){
        return (int)(1.0/2 * alas * tingSegiTiga * tinggiPrisma);
    }

    public int luasPermukaan(){
        return 2 * alas * (kelAlas * tinggiPrisma);
    }
}
