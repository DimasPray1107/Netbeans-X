/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.no.pkg4.ukl;

/**
 *
 * @author user
 */
public class SoalNo4Ukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Model 4 kolom
   for (int x=0; x<4; x++){
            for (int i=0; i<x; i++){
                System.out.print("*\t");
                
            }
            System.out.println("");
        }
        for (int x=0; x<4; x++){
            for (int i=0; i<4-x; i++ ){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
    
    

