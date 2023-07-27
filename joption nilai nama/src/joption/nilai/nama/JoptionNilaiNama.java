/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joption.nilai.nama;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class JoptionNilaiNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String angka= JOptionPane.showInputDialog("Masukkan bintang: ");
       int angka1=Integer.parseInt(angka);
       int nilaiTotal= angka1+90;
       
       JOptionPane.showMessageDialog(null, "Nilai bintang adalah "+nilaiTotal);
    }
    
}
