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
public class Ujibus2 {
    private int penumpang,maxpenumpang;
    
    // konstruktor
    public Ujibus2(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
}

