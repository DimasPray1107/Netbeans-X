/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

/**
 *
 * @author Radityo
 */
public class tugasMatriksPengurangan {

    /**
     *
     */
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {2, 8}, {9, 5}, {2, -7}};
        int b[][] = {{12, 1}, {-2, 8}, {7, 2}, {2, 7}};

        System.out.println("Hasil dari Matriks A-B adalah");
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(a[x][y] - b[x][y] + "\t");
            }
            System.out.println();
        }

    }

}
