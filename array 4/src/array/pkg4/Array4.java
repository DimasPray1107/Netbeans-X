cvbcvbbvcbb/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Array4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int jumlahsiswa = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Siswa"));
   String siswaXR5[]= new String[jumlahsiswa];
   
   for (int i = 0; i < siswaXR5.length; i++) {
        String nama= JOptionPane.showInputDialog(null, "Masukka Nama Siswa ke" + (i+1));
        siswaXR5[i] =nama;
    }
    for (int i = 0; i < siswaXR5.length; i++) {
        System.out.println("Siswa kelas XR5 adalah " + siswaXR5[i]);
    }
    
    }    
    
    
}
