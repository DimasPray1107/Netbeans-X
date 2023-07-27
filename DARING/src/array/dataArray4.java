/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

import javax.swing.JOptionPane;

/**
 *
 * @author Radityo
 */
public class dataArray4 {

    /**
     * 
     */
    public static void main(String[] args) {
        int jumlahSiswa=Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah siswa"));
        String siswaR5[]=new String[jumlahSiswa];
        
        for (int a = 0; a < siswaR5.length; a++) {
            String nama=JOptionPane.showInputDialog(null, "Masukkan nama siswa"+(a+1));
            siswaR5[a]=nama;
        }
        
        for (int b = 0; b < siswaR5.length; b++) {
            System.out.println("Siswa R5 adalah "+siswaR5[b]);
        }
        
    }

}
