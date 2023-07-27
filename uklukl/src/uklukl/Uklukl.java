/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklukl;

/**
 *
 * @author user
 */
public class Uklukl {
//overloading = sama method nya beda parameter
    /class1/
    public void Luas(int l, int p) {
        int total = l * p;
        System.out.println("Luas persegi = " + total);
    }
    /class2/
    public void Luas(double a, double t) {
        double jumlah = 2 / a * t;
        System.out.println("Luas jumlah seitiga = " + jumlah);
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.Luas(2.0, 4.0);
        t.Luas(8, 3);
    }
    //overiding
/class1/
    public void nama(){
        
    }
}
/class2/ public void nama(){
        System.out.println("Halo" + "");
    }
    public static void main(String[] args) {
        ngetes2 a = new ngetes2();
        a.nama();
    }
}
  //interface//  
 /class1/
        public interface NewInterface {
    public void nama(String nama);
}
/class2/
        public class ngetes2 implements NewInterface {

    @Override
    public void nama(String nama) {
        System.out.println("Nama saya "+nama);
    }
    public static void main(String[] args) {
        ngetes2 a = new ngetes2();
        a.nama("Pandu");
    }
    
}
            
//encapsulasi//
/class1/
private String nama;
    public void keluarkau(String nama){
    this.nama = nama;
        System.out.println("Nama Saya "+nama);
    }
}
/class2/
public static void main(String[] args) {
        ngetesukl t = new ngetesukl();
        t.keluarkau("Hilmy");
    }
        
   
  
        
}
