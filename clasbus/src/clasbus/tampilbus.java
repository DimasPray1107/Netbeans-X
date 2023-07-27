/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasbus;

/**
 *
 * @author user
 */
public class tampilbus {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Clasbus busMini=new Clasbus();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();

    
}
}