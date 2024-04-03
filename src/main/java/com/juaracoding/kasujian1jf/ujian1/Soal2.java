package com.juaracoding.kasujian1jf.ujian1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 22:16
@Last Modified 01/04/2024 22:16
Version 1.0
*/
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Masukkan teks: ");
        String teks = scanner.nextLine();

        // Menghitung panjang teks
        int panjangTeks = teks.length();

        // Mengubah teks menjadi huruf besar
        String teksUpperCase = teks.toUpperCase();

        // Mengubah teks menjadi huruf kecil
        String teksLowerCase = teks.toLowerCase();

        // Mengambil substring dari teks
        String substring = teks.substring(2, 6);

        // Output
        System.out.println("Panjang teks: " + panjangTeks);
        System.out.println("Teks (huruf besar): " + teksUpperCase);
        System.out.println("Teks (huruf kecil): " + teksLowerCase);
        System.out.println("Substring: " + substring);
    }
}
