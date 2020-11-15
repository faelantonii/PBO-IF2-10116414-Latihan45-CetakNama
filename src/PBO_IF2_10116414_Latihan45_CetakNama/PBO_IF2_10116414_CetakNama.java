/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan45_CetakNama;

import java.util.Scanner;


/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan cetak nama
 */
public class PBO_IF2_10116414_CetakNama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CetakNama cetakNama = new CetakNama();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String nama = scan.nextLine();
        
        System.out.print("Mau Cetak Nama Berapa Kali? : ");
        int cetak = scan.nextInt();
        
        cetakNama.setNama(nama);
        cetakNama.setJumlahCetak(cetak);
        cetakNama.cetak(nama);
        cetakNama.cetak(cetak, nama);
    }
}
