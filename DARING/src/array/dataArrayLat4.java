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
public class dataArrayLat4 {

    /**
     * 
     */
    public static void main(String[] args) {
        String data[][]={
            {"Alya","18765"},
            {"Aladin","11876"},
            {"Nala","17622"},
            {"Wawan","29988"},
            {"Setya","98765"},
        };
        for (int x = 0; x < data.length; x++) {
            System.out.println("Nama: "+data[x][0]+" | No. ID: "+data[x][1]);
        }


        
    }

}
