/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.ke.pkg11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PerulanganKe11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        String nama=input.nextLine();
        int jumlah=0;
        int angka=5;
        
        for(int x=1; x<=angka;x++){
        System.out.print(x +" , ");
        jumlah += x;
    }
        System.out.print(" ");
        System.out.print("jumlah dari deret tersebut"+jumlah);
    }
    }
    

