/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Elma
 */
public class NestedClass {
    String nama= "Elmaa";
    String nim= "L200230252";
    
    public void printNama(){
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass{
        static String jurusan= "Informatika";
        
        public void printInfo(){
            NestedClass p = new NestedClass();
            p.printNama();
        }
    }
    
    //inner class
    class InnerClass{
       public void Info(){
           System.out.println(StaticNestedClass.jurusan);
       } 
    }
}
