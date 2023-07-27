/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author Radityo
 */
public class perulangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++){
            for (int a = 0; a < 5 - i; a++){
                System.out.print(" ");
            }
        
            for (int c = 0; c < i; c++){
            System.out.print(" *");
            }
        
            System.out.println();
        }
        // TODO code application logic here
}
}
