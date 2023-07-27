/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author user
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int a[][]={{1,2},{2,8},{9,5},{2,-7}};
        int b[][]={{12,1},{-2,8},{7,2},{2,7}};
        
        System.out.println("Hasil dari Matriks A-B adalah");
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < 2 ; y++) {
                System.out.print(a[x][y]-b[x][y]+"\t");
            }
            System.out.println();
        }
        
    }

}
    
    

