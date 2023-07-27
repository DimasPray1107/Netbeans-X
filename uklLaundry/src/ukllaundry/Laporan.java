/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

/**
 *
 * @author user
 */
public class Laporan extends JenisLaundry {
      public void NamaToko(){
        System.out.println(""+super.NamaToko);
    }

    
    public void laporan(JenisLaundry jenislaundry){
 int x=jenislaundry.getJmlJenisLaundry();
 

 System.out.println();
 System.out.println("Tabel Laundry");
 System.out.println();
 System.out.println("JenisLaundry \tHarga \tDurasi");
 for (int i = 0; i < x; i++) {
 System.out.println(jenislaundry.getJenisLaundry(i)+"\t"+
 jenislaundry.getharga(i)+"\t"+jenislaundry.getdurasi(i));
 }
 }
 public void laporan(Client client){
 int x=client.getJmlClient();

 System.out.println();
 System.out.println("Tabel Client");
 System.out.println();
 System.out.println("Nama \tAlamat \t\tTelepon \t\t\tSaldo");
 for (int i = 0; i < x; i++) {
 System.out.println(client.getNama(i)+"\t"+
 client.getAlamat(i)+"\t"+"\t"+client.getTelepon(i)+"\t"+"\t"+
 client.getSaldo(i));
 }
 }

 public void laporan(Transaksi transaksi, JenisLaundry jenislaundry){
 int x=transaksi.getJmlTransaksi();

 System.out.println();
 System.out.println("Laporan Transaksi");
 System.out.println();
 System.out.println("Nama Laundry\tHarga \tDurasi \tJumlah");

 int total=0;
 for (int i = 0; i < x; i++) {
 int
jumlah=transaksi.getBanyaknya(i)*jenislaundry.getharga(transaksi.getIdJenisLaundry(i));
total+=jumlah;

System.out.println(jenislaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i))+"\t"+ transaksi.getBanyaknya(i)+"\t"+jenislaundry.getdurasi((i))+"\t"+jumlah);
 }
 System.out.println("Total Omset ="+total);
 }

    
 }

