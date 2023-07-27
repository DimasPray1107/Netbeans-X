/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;



/**
 *
 * @author user
 */
public class Lingkaran {

    private int alas, tinggi;
    
    public void setAlas(int alas) {
       this.alas = alas; 
        
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public int getAlas(){
        return this.alas;
    }
    
    public int getTinggi(){
        return this.tinggi;
    
   }
    public int getcare (){
        int luas = alas*tinggi;
        System.out.println("luas Lingkaran: "+luas);
        return 0;
}
    
}





    

