/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswaTest;

import mahasiswa.mahasiswa;
/**
 *
 * @author SB 604-14
 */
public class mahasiswaTest {
    
    public static mahasiswa m;
    
    public void awalTest(){
        m = new mahasiswa();
        System.out.print("Awal testing");      
    }
    
    public void getNrp(){
        System.out.print(m.getNrp()+"Tidak boleh kosong");
        
    }
    
    
}
