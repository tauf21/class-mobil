/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author taufik.amary@gmail.com
 */
public class mobilku {
    //variable class
    private int merk;
    private String nama;
    private String jenis;
    private String warna;
    
    //informasi mobil --> METHOD
    public void masuk_info(int mrk, String nm){
        this.merk = mrk;
        this.nama = nm;
    }
    public void masuk_jenis() {
        System.out.println("asd");
    }
    public void masuk_spesifikasi(String jn, String cl){        
        this.warna=cl;
        this.jenis=jn;
    }
    
    public void info(){
        System.out.println("No      = "+this.merk);
        System.out.println("Nama    = "+this.nama);
        System.out.println("Jenis   = "+this.jenis);
        System.out.println("Warna   = "+this.warna);
    }
    
}
