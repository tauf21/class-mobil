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
public class mobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //buat 2 buah obyek mobilku yaitu mobil1 dan mobil2
        mobilku mobil1 = new mobilku();//obyek 1 bernama mobil1
        mobilku mobil2 = new mobilku();//obyek 2 bernama mobil2
        
        //memberi nomor dan nama objek mobil1 dan mobil2
        mobil1.masuk_info(1, "HONDA");
        mobil2.masuk_info(2, "TOYOTA");
        
        //memberi jenis dan warna objek mobil1 dan mobil2
        mobil1.masuk_spesifikasi("JAZZ", "RED");
        mobil2.masuk_spesifikasi("FORTUNER","BLACK");
        
        //panggil method
        mobil1.info();
        mobil2.info();
        
    }
    
}
