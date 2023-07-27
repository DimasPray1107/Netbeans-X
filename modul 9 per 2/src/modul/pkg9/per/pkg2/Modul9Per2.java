/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9.per.pkg2;

/**
 *
 * @author user
 */


    /**
     * @param args the command line arguments
     */
  public class NilaiMaksimum {
  public static void main(String[] args) {
    int maksimum, jumlah, i, lokasi = 1, array[];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Jumlah bilangan: ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    
    for(i = 0; i < jumlah; i++) {
      System.out.print("masukkan bilangan ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("Nilai terbesar adalah "+maksimum);
    
  }
    }
    
}
