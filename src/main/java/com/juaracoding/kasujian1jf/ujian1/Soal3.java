package com.juaracoding.kasujian1jf.ujian1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 22:17
@Last Modified 01/04/2024 22:17
Version 1.0
*/
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int hari, jumlah, hargaSatuan, total;

        // Membaca input hari
        System.out.print("Pilih Hari: ");
        hari = input.nextInt();

        // Membaca input jumlah tiket
        System.out.print("Jumlah: ");
        jumlah = input.nextInt();

        // Menentukan harga satuan berdasarkan hari
        if (hari <= 2) {
            hargaSatuan = 45000;
        } else if (hari <= 7) {
            hargaSatuan = 30000;
        } else {
            System.out.println("Hari yang dipilih tidak valid!");
            return;
        }

        // Menghitung total harga
        total = jumlah * hargaSatuan;

        // Menampilkan output
        System.out.println("Qty: " + jumlah);
        System.out.println("Harga satuan: Rp" + hargaSatuan);
        System.out.println("Total: Rp" + total);
    }
}
