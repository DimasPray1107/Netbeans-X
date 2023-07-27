/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author user
 */
public class aeroplan extends vehicle {
    @Override
    public void walk(){
        System.out.println("Aeroplan Terbang");
    }
    public static void main(String[] args) {
        aeroplan rajawali = new aeroplan();
        rajawali.function();
        rajawali.fuel();
        rajawali.walk();
    }
}
