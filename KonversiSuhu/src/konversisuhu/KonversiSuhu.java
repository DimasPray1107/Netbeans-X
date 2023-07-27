/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

public class KonversiSuhu {

   
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("masukkan nilai suhu celcius");
        double c = input.nextDouble();
        

         
         System.out.println("=====================");
         double r = c*4/5;
         System.out.println("Suhu Celcius ke reamur : "+r);
         double f = (c*9/5)+32;
         System.out.println("Suhu Celcius ke fahrenheit : "+f);
         double k = c + 273.15;
         System.out.println("Suhu Celcius ke farenheit :"+k);
    }
    
}
