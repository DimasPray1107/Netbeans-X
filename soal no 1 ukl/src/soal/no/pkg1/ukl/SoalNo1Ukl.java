/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.no.pkg1.ukl;

/**
 *
 * @author user
 */
public class SoalNo1Ukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal= 16;
        int beda= 5;
        int tampilAwal= 18;
        int tampilAkhir= 30;
        int NilaiSukuKeX=awal;
        int JumlahSuku=0;
        
        for (int i = tampilAwal; i <= tampilAkhir; i++) {
            NilaiSukuKeX= awal+(beda*(i-1));//
            System.out.println("Nilai Suku ke :"+i+" adalah"+NilaiSukuKeX);
                JumlahSuku +=NilaiSukuKeX;
               }
        System.out.println("Jumlah deret aritmatika tersebut adalah"+JumlahSuku);
    }
    
}
