/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Elma
 */
public class DemoCustomerData {
    public static void main(String[] args) {
        CustomerData customer1 = new CustomerData("Elma", "Brebes", "10-02-2005", "Direktur", 8000000);
        CustomerData customer2 = new CustomerData("Zami", "Bumiayu", "03-03-2006", "Mandor", 5000000);
        CustomerData customer3 = new CustomerData("Dzaka", "Klaten", "23-08-2004", "Dosen", 5000000);
        CustomerData customer4 = new CustomerData("Zapi", "Solo", "12-12-2003", "Mandor", 5000000);
        CustomerData customer5 = new CustomerData("Aiyra", "Yogyakata", "14-05-2004", "Arsitek", 7000000);
        CustomerData customer6 = new CustomerData("Suryani", "Bali", "06-08-1998", "Guru", 3000000);
        CustomerData customer7 = new CustomerData("Ruwiyah", "Cilacap", "04-05-1887", "Owner Donat", 4500000);
        CustomerData customer8 = new CustomerData("Fahri", "Bandung", "18-10-1999", "Pilot", 9000000);
        CustomerData customer9 = new CustomerData("Yusuf", "Sulawesi", "30-05-2005", "Dokter", 8000000);
        CustomerData customer10 = new CustomerData("Lipa", "Jakarata", "03-04-2005", "HRD", 8500000);
    
        customer1.print();
        customer2.print();
        customer3.print();
        customer4.print();
        customer5.print();
        customer6.print();
        customer7.print();
        customer8.print();
        customer9.print();
        customer10.print();
    }
}
