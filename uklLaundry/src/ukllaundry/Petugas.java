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
public class Petugas implements User{
 private ArrayList<String> namaPetugas = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> jabatan = new ArrayList<Integer>();
 
 public Petugas() {
 this.namaPetugas.add("admin");
 this.alamat.add("kedung kandang");
 this.telepon.add("081112223333");
 this.jabatan.add(0);
 }
 public void setPetugas(int jabatan ){
 this.jabatan.add(jabatan);
 }
 public int getPetugas(int id){
 return this.jabatan.get(id);
 } 
 public int getJmlPetugas(){
 return this.namaPetugas.size();
 } 
 @Override
 public void setClient(String namaPetugas ){
 this.namaPetugas.add(namaPetugas);
 }
 
 @Override
 public void setAlamat(String alamat ){
 this.namaPetugas.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.namaPetugas.add(telepon);
 }
 
 @Override
 public String getNama(int idPetugas){
 return this.namaPetugas.get(idPetugas);
 }
 
 @Override
 public String getAlamat(int idPetugas){
 return this.alamat.get(idPetugas);
 }

    @Override
    public String getTelepon(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }

 
