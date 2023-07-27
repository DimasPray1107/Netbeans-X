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
public class hitung {
 
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();

       
       persegipanjang perjang = new persegipanjang();
       perjang.lebar=34;
       perjang.panjang=4;
       
       bangundatar.luas();
     
       
       perjang.luas();
     
    }
}
