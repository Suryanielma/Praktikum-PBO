/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author Elma
 */
public class ManagerDemo {

    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setNama("Suryani");
        manager1.setGaji(10000000);
        manager1.setUsia(19);
        manager1.setJamKerja(8.5f);

        Manager manager2 = new Manager();
        manager2.setNama("Elma");
        manager2.setUsia(19);
        manager2.setGaji(50000000);
        manager2.setJamKerja(8.5f);

        Manager manager3 = new Manager();
        manager3.setNama("Ruwiyah");
        manager3.setUsia(36);
        manager3.setGaji(40000000);
        manager3.setJamKerja(8.5f);

        Manager manager4 = new Manager();
        manager4.setNama("Zami");
        manager4.setUsia(18);
        manager4.setGaji(3500000);
        manager4.setJamKerja(8.5f);

        Manager manager5 = new Manager();
        manager5.setNama("Fahri");
        manager5.setUsia(17);
        manager5.setGaji(20000000);
        manager5.setJamKerja(8.5f);

        System.out.println("Nama : " + manager1.getNama());
        System.out.println("Gaji : " + manager1.getGajiManager());
        System.out.println("Usia: " + manager1.getUsia());
        System.out.println("Jam Kerja : " + manager1.jamKerja() + "\n");
        
        System.out.println("Nama : " + manager2.getNama());
        System.out.println("Gaji : " + manager2.getGajiManager());
        System.out.println("Usia: " + manager2.getUsia());
        System.out.println("Jam Kerja : " + manager2.jamKerja() + "\n");

        System.out.println("Nama : " + manager3.getNama());
        System.out.println("Gaji : " + manager3.getGajiManager());
        System.out.println("Usia: " + manager3.getUsia());
        System.out.println("Jam Kerja : " + manager3.jamKerja() + "\n");
        
        System.out.println("Nama : " + manager4.getNama());
        System.out.println("Gaji : " + manager4.getGajiManager());
        System.out.println("Usia: " + manager4.getUsia());
        System.out.println("Jam Kerja : " + manager4.jamKerja() + "\n");
        
        System.out.println("Nama : " + manager5.getNama());
        System.out.println("Gaji : " + manager5.getGajiManager());
        System.out.println("Usia: " + manager5.getUsia());
        System.out.println("Jam Kerja : " + manager5.jamKerja() + "\n");
    }
}
