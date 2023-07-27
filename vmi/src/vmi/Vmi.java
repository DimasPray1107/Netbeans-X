/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmi;

class Parent {
    int x = 5;
    public void Info (){
        System.out.println("Ini Class Parent");
    }
}
  class Child extends Parent {
    int x = 10;
    public void Info(){
        System.out.println("Ini Class Child");
    }
}
public class Vmi {

   public static void main(String[] args) {
        // TODO code application logic here
        Parent tes = new Child();
        System.out.println("Nilai X ="+tes.x);
        tes.Info();
        
        
    }
    }
    

