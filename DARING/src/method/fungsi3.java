/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import javax.swing.JOptionPane;

/**
 *
 * @author Radityo
 */
public class fungsi3 {

    private static double hitung(double a, double b) {
        double penjumlahan;
        return penjumlahan = a - b;
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai B"));

        JOptionPane.showMessageDialog(null, "Luas hasil penjumlahan : " + hitung(a, b));
    }

}
