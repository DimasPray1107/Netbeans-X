/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pholimorphisme2;

/**
 *
 * @author user
 */
public class Staf extends Pegawai{
    private static final int gasiStaf=50000;
    private static final int bonusStaf=10000;
    
    @Override
    public int gaji(){
        return gasiStaf;
    }
    
    public int Bonus(){
        return bonusStaf;
    }
}
