/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Elma
 */
import java.util.Date;
public class OverloadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    public OverloadingConstructor(){
    }
    public OverloadingConstructor(int idUser, String userName){
        this.idUser = idUser;
        this.userName = userName;
    }
}
