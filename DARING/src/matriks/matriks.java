/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriks;

/**
 *
 * @author Radityo
 */
public class matriks {

    /**
     * 
     */
    public static void main(String[] args) {
        int a[][]={{-7,5}, {4,8}};
        int b[][]={{1,1}, {-4,9}};
        
        System.out.println("Hasil Matriks A-B = ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }

        
        
    }

}
