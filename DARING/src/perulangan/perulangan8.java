/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;
/**
 *
 * @author Radityo
 */
public class perulangan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("No. Absen : ");
        int absen = input.nextInt();
        System.out.println("------------");
        //
        for (int a=0;a<=absen;a++){
            System.out.println(nama +" Perulangan ke - "+a);
        }
        
    }
    
}
