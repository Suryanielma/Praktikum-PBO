/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author Elma
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    
    public float jamKerja(){ //Getter
        return jamKerja;  
    }
    
    //penambahan setter
    public void setJamKerja(float jamKerja){
        this.jamKerja = jamKerja;
    }
    
    public float getGajiManager(){
        return getGaji()*2;
    }

}
