/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author user
 */
public class persegipanjang extends BangunDatar {
    float panjang,lebar;
    
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("luas persegi panjang = " + luas);
        
    }
     
   
}
