/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
public interface AktivityLampu {
    public static final int LAMPU_HIDUP=1;
    public static final int LAMPU_MATI=0;
    public static final int LAMPU_REDUP=4;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}
