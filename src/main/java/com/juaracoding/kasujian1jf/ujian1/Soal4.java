package com.juaracoding.kasujian1jf.ujian1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 22:45
@Last Modified 01/04/2024 22:45
Version 1.0
*/
import java.util.Scanner;
public class Soal4 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Loop untuk terus meminta input angka
    while (true) {
        System.out.print("Masukkan angka (0 untuk keluar): ");
        int angka = scanner.nextInt();

        // Keluar dari loop jika angka 0 dimasukkan
        if (angka == 0) {
            break;
        }

        // Tampilkan pesan
        System.out.println("Anda memasukkan angka " + angka);
    }

    System.out.println("Program selesai!");
}
}
