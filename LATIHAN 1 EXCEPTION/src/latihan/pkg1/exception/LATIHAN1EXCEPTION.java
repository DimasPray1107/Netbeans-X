/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1.exception;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LATIHAN1EXCEPTION {

    /**
     * @param args the command line arguments
     */

public class L {
    
}
public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.println("Enter the value for c");
// Exception Handling
try{
int c = console.nextInt();
int res=c/0;
System.out.println(" The result is "+res);
}
catch (Exception exception_message){
System.out.println("adalah= "+exception_message);
}
}
}