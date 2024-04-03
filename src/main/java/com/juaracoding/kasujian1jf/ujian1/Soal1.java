package com.juaracoding.kasujian1jf.ujian1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 22:13
@Last Modified 01/04/2024 22:13
Version 1.0
*/
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print(" ");
        int qty = scanner.nextInt();

        System.out.print(" ");
        int harga = scanner.nextInt();
        double harga2=harga;

        // Menghitung jumlah
        double jumlah = qty * harga;

        // Output
        System.out.println("qty: " + qty);
        System.out.println("Harga: " + harga2);
        System.out.println("Jumlah: " + jumlah);
    }
}
