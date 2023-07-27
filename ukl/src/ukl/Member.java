/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Member implements User {
    
    private ArrayList<String> namaMember = new ArrayList<String> ();
    private ArrayList<String> alamat = new ArrayList<String> ();
    private ArrayList<String> telepon = new ArrayList<String> ();
    private ArrayList<Integer> saldo = new ArrayList<Integer> ();
    //konstraktor : method yang namanya=class dan dia akan dijalankan ketika objek kita jalankan
    public Member(){
        this.namaMember.add("Dimdim");
        this.alamat.add("Kediri");
        this.telepon.add("081242554963");
        this.saldo.add(100000);
        
        this.namaMember.add("Rizriz");
        this.alamat.add("Malank");
        this.telepon.add("081242824963");
        this.saldo.add(25000);
        
        this.namaMember.add("Mimi");
        this.alamat.add("Batu");
        this.telepon.add("081243244963");
        this.saldo.add(93000);
        
        this.namaMember.add("Wise");
        this.alamat.add("Arab");
        this.telepon.add("084243242963");
        this.saldo.add(45000);
        
        
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    
    public int getJmlMember(){
        return this.saldo.size();
        
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
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
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }
    public String getTelepon (int idMember) {
        return this.telepon.get(idMember);
    }
        void editSaldo(int idMember, int Saldo) {
            this.saldo.set(idMember, Saldo);
           
        
        
    }
    }
    
    

