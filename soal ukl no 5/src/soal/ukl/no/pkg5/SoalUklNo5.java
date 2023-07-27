/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.ukl.no.pkg5;

/**
 *
 * @author user
 */
public class SoalUklNo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int a[][]={{8,9,5,},{7,9,5,},{7,6,5,}};
        int b[][]={{6,9,7,},{1,3,5,},{7,6,5,}};
        
        System.out.println("hasil A+B");
        for (int i=0; i<3; i++){
      for (int j=0; j<3; j++){
      System.out.print(a[i][j]+b[i][j]+"\t");
    }
  System.out.println("");  
}
    }
}