/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     StudentRecord dt = new StudentRecord();
     dt.setName("Sugeng","Malang","19");
        System.out.println(dt.getName());
     
    }
    
}
class StudentRecord{
   private String name;
private String alamat;
private String umur;
public void setName(String temp,String alm,String umr){
    this.name=temp;
    this.alamat=alm;
    this.umur=umr;
}
public String getName(){
   return this.name+" "+this.alamat+
           " umur "+this.umur; 
}
}
