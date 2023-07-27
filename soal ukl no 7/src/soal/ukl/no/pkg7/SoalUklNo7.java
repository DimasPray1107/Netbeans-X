/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.ukl.no.pkg7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SoalUklNo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String[] nama = {"Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamat = {"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};
        int[] golongan = {1,2,3,2};

        Scanner input = new Scanner(System.in);
        System.out.print("masukan id: ");
        int id = input.nextInt();

        // nomor id
        if (id < 1 || id> nama.length) {
            System.out.println("nomor id yang anda masukan salah");
        }
        // pemakaian listrik1
        else {
            System.out.print("masukan jenis pemakaian listrik (kwh) : ");
            int listrik = input.nextInt();

            int tagihan = hitung(golongan[id-1], listrik);

            System.out.println("Nama pelanggan      : " + nama[id-1]);
            System.out.println("Golongan            : " + golongan[id-1]);
            System.out.println("Alamat              : " + alamat[id-1]);
            System.out.println("Total tagihan       : " + "Rp. " + tagihan);

            if (tagihan < 50_000) {
                System.out.println("Total tagihan menjadi Rp. 50000");
            }
        }
        




    }

    static int hitung(int golongan, int listrik) {

        int admin = 13_000;
        int tagihan = 0;

        if (golongan == 1) {
            tagihan = listrik * 1000 + admin;
        }
        else if (golongan == 2){
            tagihan = listrik * 1300 + admin;
        }
        else if (golongan == 3){
            tagihan = listrik * 1500 + admin;
        }
        return tagihan;
    }
}