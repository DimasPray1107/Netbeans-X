/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus2;

/**
 *
 * @author user
 */
public class tampilujibus2 {

 
      
      public static void main(String[] args) {
          
      
        // TODO code application logic here
        Ujibus2 busMini=new Ujibus2(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
          
    }
}



    