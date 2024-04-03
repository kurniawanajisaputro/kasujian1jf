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
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Pilih Hari: ");
        int hari = scanner.nextInt();
        System.out.print("Jumlah: ");
        int jumlah = scanner.nextInt();

        // Harga
        int hargaSatuan;
        if (hari <= 2) {
            hargaSatuan = 45000;
        } else {
            hargaSatuan = 30000;
        }

        // Total
        int total = hargaSatuan * jumlah;

        // Output
        System.out.println("Qty: " + jumlah);
        System.out.println("Harga Satuan: Rp" + hargaSatuan);
        System.out.println("Total: Rp" + total);
    }
}
