/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend;

/**
 *
 * @author ACER
 */
public class BatikAir extends Pesawat{
    private String nama;
    private int harga;
    
    BatikAir(){
        
    }
    BatikAir(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public int cekHarga(){
        return harga = 1000000;
    }
    public void info(){
        System.out.println("============================");
        System.out.println("Nama Pesawat  : "+nama);
        System.out.println("Harga         : "+ harga);
        System.out.println("============================");
    }
}
