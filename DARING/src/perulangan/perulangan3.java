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
public class perulangan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b = 5;
        
        for (int i = 1; i <= b; i++) {
        // printing spaces
        
            for (int a = 0; a < b - i; a++) {
                System.out.print(" ");
            }
        // printing star
            for (int c = 0; c < i; c++) {
            System.out.print("*");
            }
        
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
