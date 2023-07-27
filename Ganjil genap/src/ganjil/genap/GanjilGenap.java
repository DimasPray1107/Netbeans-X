/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjil.genap;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      public void gangen
        (){
       int a;
       Scanner input = new Scanner(System.in)
       System.out.print("Masukkan angka : ");
       a = input.nextInt();
       if (a % 2 == 0) {
        System.out.print("Bilangan " + a + " adalah genap.\n");
       }else{
        System.out.print("Bilangan " + a + " adalah ganjil.\n");
    }
    }
}
class call{
    public static void main(String[] args) {
        GanjilGenap ganjilgenap = new GanjilGenap();
        ganjilgenap.gangen();
    }
}