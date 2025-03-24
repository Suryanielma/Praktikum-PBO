package Single_Hierarki_Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elma
 */
public class Programmer extends Pegawai{
    public static void main(String[] args) {
    double lemburPerJam = 50000;
    double gajiPerBulan;
    
    Pegawai pegawai = new Pegawai();
    gajiPerBulan = pegawai.gajiPokok + lemburPerJam;
    System.out.println(gajiPerBulan);
    }
}
