/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author Elma
 */
public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
    
    car1.changeCadence(50);
    car1.speedUp(20);
    car1.changeGear(2);
    car1.infoCar();

    car2.changeCadence(30);
    car2.speedUp(10);
    car2.changeGear(1);
    car2.infoCar();
}
}
