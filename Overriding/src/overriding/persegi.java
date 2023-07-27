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
public class persegi extends BangunDatar {
    float sisi;
    public void luas(){
        float luas=sisi*sisi;
        System.out.println("Luas persegi = " + luas);
    }
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling persegi = " + keliling);
    }
    
}
