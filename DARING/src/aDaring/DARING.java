/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aDaring;

/**
 *
 * @author Radityo
 */
public class DARING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai=49;
        
        if (nilai==100){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            if(nilai==100){
                System.out.println("sempurna");
            }
        }
        else if (nilai >=89){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
            if(nilai >=89){
                System.out.println("sedikit lagi dapat nilai A");
            }
        }
        else if (nilai >=70){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
        }
        else if (nilai >=50){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
            if (nilai<50){
                System.out.println("tidak lulus");
            }

        // TODO code application logic here
    }
    
    }
}
