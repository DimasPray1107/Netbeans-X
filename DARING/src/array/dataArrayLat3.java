/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

/**
 *
 * @author Radityo
 */
public class dataArrayLat3 {

    /**
     * 
     */
    public static void main(String[] args) {
        String nama[][]={
                {"Arya","10001"},
                {"Bagas","10002"},
                {"Chintya","10003"},
            };
        
            for (int x=0; x<nama.length; x++){
                System.out.println("Nama : " +nama[x][0]);
                System.out.println("Nomor : " +nama[x][1]);
                System.out.println("=============");
            }

        
    }

}
