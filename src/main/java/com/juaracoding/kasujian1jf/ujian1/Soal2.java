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
        Scanner input = new Scanner(System.in);

        // Menerima input dari user
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Menghitung panjang string
        int panjangKata = kata.length();

        // Mengubah string menjadi huruf kapital
        String kataKapital = kata.toUpperCase();

        // Mengubah string menjadi huruf kecil
        String kataKecil = kata.toLowerCase();

        // Mendapatkan substring dari kata
        String substring = kata.substring(7);

        // Menampilkan output
        System.out.println("Panjang kata: " + panjangKata);
        System.out.println("Huruf kapital: " + kataKapital);
        System.out.println("Huruf kecil: " + kataKecil);
        System.out.println("Substring: " + substring);
    }
}
