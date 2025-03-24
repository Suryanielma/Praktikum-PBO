/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author Elma
 */
public class Car {
    int cadence;
    int speed;
    double gear;
    
void changeCadence (int CarCadence) {
    cadence = CarCadence;
}

void speedUp (int CarSpeed) {
    speed = CarSpeed;
}

void changeGear (int CarGear) {
    gear = CarGear;
}

void infoCar(){
    System.out.println(
        "CarCadence : " + cadence + "\n" +
        "CarSpeed : " + speed + "\n" +
        "CarGear : " + gear +"gr" + "\n");
}
}
