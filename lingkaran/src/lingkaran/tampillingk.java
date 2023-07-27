/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.util.Scanner;

/**
 *
 * @author user
 */

    class tampil{
        public static void main(String[] args) {
            Lingkaran l=new Lingkaran();
            Scanner scan=new Scanner (System.in);
            System.out.println("Masukkan nilai alas");
            int alas=scan.nextInt();
            System.out.println("Masukkan nilai tinggi");
            int tinggi=scan.nextInt();
            l.setAlas(alas);
            l.setTinggi(tinggi);
            System.out.println("Nilai alas: "+l.getAlas());
            System.out.println("Nilai tinggi: "+l.getTinggi());    
            System.out.println("Nilai luas Lingkaran: "+l.getcare());
        }
}


