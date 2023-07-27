/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9.pertemuan.dua;

import java.util.Scanner;


public class Modul9PertemuanDua {

   
    public static void max(int a,int b,int c) {
        // TODO code application logic here
            int max;
            System.out.println("nilai tertinggi: ");
    
            int maks = Math.max(a, b);
                    if (c>maks){
                        maks = c;
                    }
                    System.out.println(maks);
    }
                     public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    int a,b,c;
                    
                    System.out.print("Masukan nilai a : ");
                    a=input.nextInt();
                    
                    System.out.print("Masukan nilai b : ");
                    b = input.nextInt();
                    
                    System.out.print("Masukan nilai c: ");
                    c=input.nextInt();
                    
                  max(a,b,c);
                    
                    
                    

                    
                   
                }
        
    }
    

