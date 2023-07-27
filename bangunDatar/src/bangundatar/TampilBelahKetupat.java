/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TampilBelahKetupat {
    public static void main(String[] args) {
        
        Belahketupat B = new Belahketupat();
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan diagonal1");
        int diagonal1=scan.nextInt();
        System.out.println("Masukkan diagonal2");
        int diagonal2=scan.nextInt();
        System.out.println("Masukkan sisi");
        int sisi=scan.nextInt();
        B.luasBelahketupat(diagonal1, diagonal2);
        B.Keliling(sisi);
     
    }
}

