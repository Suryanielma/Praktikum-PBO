/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peercobaan;

/**
 *
 * @author Elma
 */
public class OuterDemo {
    int num;

    //inner clas
    private class InnerDemo{
        private void print(){
            System.out.println("Ini merupakan method inner class");
        }
    }
        
    //akses method inner class dari method outer class
        void displayInner(){
            InnerDemo inner = new InnerDemo();
            inner.print();
        }
    }
