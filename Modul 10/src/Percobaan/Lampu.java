/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
public class Lampu implements AktivityLampu{
    public int statusLampu;
    
    @Override
    public void matikanLampu(){
        if(statusLampu == 0){
            System.out.println("Lampu sudah dalam kondisi mati");
        }
        else if(statusLampu == 1){
            statusLampu =-1;
            System.out.println("Lampu sudah dimatikan");
        }
    }
    
    @Override
    public void hidupkanLampu(){
        if(statusLampu == 1){
            System.out.println("Lampu sudah dinyalakan\n");
        }
        else{
            statusLampu =+ 1;
            System.out.println("Lampu sudah dalam kondisi menyala");    
        }
    }
    
    @Override
    public void redupkanLampu(){
        if(statusLampu == 4){
            System.out.println("Lampu sudah diredupkan");
        }
    }
    
    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
   
