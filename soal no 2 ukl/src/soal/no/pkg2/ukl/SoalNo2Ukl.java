/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.no.pkg2.ukl;

/**
 *
 * @author user
 */
public class SoalNo2Ukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]= {{1,2,3,4,5}};
        int b[][]= {{3,3,3}};
        int hasil[][]={{0,0,0,0,0},{0,0,0}};
        System.out.println("Perkalian Matriks A dan B: ");
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 1; k++) {
                    hasil [i][j]=hasil[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //tampilkan hasil
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(hasil[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
