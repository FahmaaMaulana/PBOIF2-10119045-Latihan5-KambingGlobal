/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan5.kambingglobal;

/**
 *
 * @author Legion
 * NAMA         : Fahma Maulana
 * KELAS        : PBOIF2
 * NIM          : 10119045
 * Deskripsi    : Kambing Global
 */

public class PBOIF210119045Latihan5KambingGlobal {
// Variabel jumlahkambing menjadi variabel instance 
    
    int jumlahkambing = 88;
    
    // Method untuk menampilkan jumlah kambing 
    public void getjumlahKambing() { 
        System.out.println("jumlah kambing:" + 88);
    }
    
    public void tambahKambing() {
       jumlahkambing = jumlahkambing + 5;
       System.out.println("jumlah kambing setelah ditambah:" + 
                           jumlahkambing);  
    }
    
    public static void main(String[] args) {
        PBOIF210119045Latihan5KambingGlobal kambingSusu = new PBOIF210119045Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getjumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }
    
}
