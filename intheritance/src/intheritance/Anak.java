/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intheritance;

/**
 *
 * @author user
 */
public class Anak extends Ayah {
    double nilaimax=99.9;
    String nama="Dina";
    int age= 17;
    public void Cetak(){
        System.out.println("Anak ini memiliki sidat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
    
}
