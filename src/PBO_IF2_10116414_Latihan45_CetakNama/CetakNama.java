/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan45_CetakNama;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan cetak nama
 */
public class CetakNama {
    private int jumlahCetak;
    private String nama;

    public int getJumlahCetak() {
        return jumlahCetak;
    }

    public void setJumlahCetak(int jmlCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jumlahCetak, String nama) {
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jumlahCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
}
