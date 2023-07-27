/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun.datar.limas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tampilLimas {
    public static void main(String[] args) {
        LimasSegitiga L = new LimasSegitiga ();
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukkan Luas alas");
         int luas=scan.nextInt();
         System.out.println("Masukkan Tinggi");
        int tinggi=scan.nextInt();
        L.volumeLimasSegitiga(luas, tinggi);
    }
}
