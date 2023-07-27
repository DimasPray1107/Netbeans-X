/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aDaring;

import java.util.Scanner;

/**
 *
 * @author Radityo
 */
public class deretBilGanjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Absen kamu : ");
        int absen=input.nextInt();
        int jumlah=0;
        
        for (int a = 27; a <=100; a+=2) {
            System.out.print(a + ", ");
            jumlah += a;
        }
        System.out.println();
        System.out.println("Jumlah dari deret tersebut adalah : "+jumlah);
        }
        // TODO code application logic here
    }
    

