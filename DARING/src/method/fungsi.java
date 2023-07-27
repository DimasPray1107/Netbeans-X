/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Radityo
 */
public class fungsi {

    public static void hitungLuasLingkaran(double jari) {
        System.out.println("Luas Lingkaran dengan jari-jari " + jari + " adalah " + (3.14 * jari * jari));
    }
    
    private static double hitungKelilingLingkaran(int jari){
        double keliling;
        return keliling=2*3.14*jari;
    }

    public static void main(String[] args) {
        hitungLuasLingkaran(6.5);
        System.out.println("Luas Lingkaran adalah : "+hitungKelilingLingkaran(12));

    }

}
