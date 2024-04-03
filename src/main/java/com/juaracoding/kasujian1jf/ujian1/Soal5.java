package com.juaracoding.kasujian1jf.ujian1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 22:50
@Last Modified 01/04/2024 22:50
Version 1.0
*/
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input karakter/teks
        System.out.print("Karakter: ");
        String input = scanner.nextLine();

        // Mendapatkan karakter pertama
        char karakter = input.charAt(0);

        // Menghitung kode ASCII
        int kodeAscii = (int) karakter;

        // Menampilkan output
        System.out.println("Kode ASCII dari " + karakter + " adalah " + kodeAscii);
    }
}
