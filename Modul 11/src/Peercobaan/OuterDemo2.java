/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peercobaan;

/**
 *
 * @author Elma
 */
public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("Ini adalah nilai dari variabel private outerDemo");
            return num;
        }
    }
}
