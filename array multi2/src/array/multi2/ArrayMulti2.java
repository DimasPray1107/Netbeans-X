/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.multi2;

/**
 *
 * @author user
 */
public class ArrayMulti2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datasiswa[][]={
            {"iwan false","maluku"},
            {"budi gaming","jakarta"},
            {"supardi jr","blitar"},
        };
        System.out.println(datasiswa[1][1]);
        System.out.println();
        for(int j=0;j<datasiswa.length;j++){
            System.out.println("nama: "+datasiswa[j][0]+",alamat:"+datasiswa[j][1]);
        }
    }
    
}
