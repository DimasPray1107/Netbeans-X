/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class JenisLaundry {
    
  String NamaToko="D Laundry";

   
    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.JenisLaundry.add("Baju Seragam");
        this.harga.add(65000);
        this.durasi.add(55);
        this.JenisLaundry.add("Baju Biasa");
        this.harga.add(70000);
        this.durasi.add(60);
        this.JenisLaundry.add("Baju Dalam");
        this.harga.add(50000);
        this.durasi.add(30);
    }

   public int getJmlJenisLaundry(){
 return this.JenisLaundry.size();
 }
 public void setJenisLaundry(String JenisLaundry ){
 this.JenisLaundry.add(JenisLaundry);
 }
 public String getJenisLaundry(int idJenisLaundry){
 return this.JenisLaundry.get(idJenisLaundry);
 } 
 
 public void setharga (int harga){
     this.harga.add(harga);
     }
 public int getharga ( int harga){
     return this.harga.get(harga);
     } 
 
 public void setdurasi (int durasi){
     this.durasi.add(durasi);
     }
 public int getdurasi ( int durasi ){
     return this.durasi.get(durasi);
     }
 
}
