/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Printer {
    
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return jmlCetak;
    }
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
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
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
    
}

public class CetakNama {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Printer p = new Printer();
        
        String nama;
        int jmlCetak;
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        p.setNama(nama);
        System.out.print("Mau cetak nama berapa kali? : ");
        jmlCetak = input.nextInt();
        p.setJmlCetak(jmlCetak);
        
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
    }
}