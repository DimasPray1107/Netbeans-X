/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author user
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama[] = new String[4];
        nama[0]= " budi";
        nama[1]= " dekop";
        nama[2]= " billy";
        nama[3]= " mas eko";
        String alamat [] = {" malang"," kediri"," surabaya"," jombang"};
        System.out.println("nama anda: "+nama[1]+",alamat anda:"+alamat[1]);
        for(int n=0;n<nama.length;n++){
        System.out.println("nama anda: "+nama[n]+",alamat anda: "+alamat[n]);
        }
        
    }
    
    
}

