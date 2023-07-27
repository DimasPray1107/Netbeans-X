/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Radityo
 */
public class dataArray3 {

    /**
     * 
     */
    public static void main(String[] args) {
        String angka= JOptionPane.showInputDialog("Masukkan nilai siswa : ");
        int angka1=Integer.parseInt(angka);
        int nilaiTotal=angka1+100;
        
        
        JOptionPane.showMessageDialog(null, "Nilai akhir siswa adalah : "+nilaiTotal);
        
    }

}
