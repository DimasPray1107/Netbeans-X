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
public class Client implements User{
     private ArrayList<String> namaClient = new ArrayList<String> ();
    private ArrayList<String> alamat = new ArrayList<String> ();
    private ArrayList<String> telepon = new ArrayList<String> ();
    private ArrayList<Integer> saldo = new ArrayList<Integer> ();
    
    //konstraktor : method yang namanya=class dan dia akan dijalankan ketika objek kita jalankan
    public Client(){
        this.namaClient.add("Dimdim");
        this.alamat.add("Kediri");
        this.telepon.add("081242554963");
        this.saldo.add(300000);
        
        this.namaClient.add("Rizriz");
        this.alamat.add("Malank");
        this.telepon.add("081242824963");
        this.saldo.add(200000);
        
        this.namaClient.add("Mimi");
        this.alamat.add("Batu");
        this.telepon.add("081243244963");
        this.saldo.add(400000);
        
        this.namaClient.add("Wise");
        this.alamat.add("Arab");
        this.telepon.add("084243242963");
        this.saldo.add(450000);

    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idCliet){
        this.saldo.add(idCliet);
    }
    
    public int getJmlClient(){
        return this.saldo.size();
        
    }

    @Override
    public void setClient(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idNama) {
        return this.namaClient.get(idNama);    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }
    public String getTelepon (int idClient) {
        return this.telepon.get(idClient);
    }
        void editSaldo(int idClient, int Saldo) {
            this.saldo.set(idClient, Saldo);
           
        
        
    }
    }