/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmi2;
class Vehicle {
    public void move(){
        System.out.println("Vehicle are uset moving"+"from one place to another");
    }
}
class Car extends Vehicle{
    public void move(){
        super.move();
        System.out.println("Car is a good medium transport");
    }
}

public class Vmi2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle b = new Car();
        b.move();
    }
    
}
