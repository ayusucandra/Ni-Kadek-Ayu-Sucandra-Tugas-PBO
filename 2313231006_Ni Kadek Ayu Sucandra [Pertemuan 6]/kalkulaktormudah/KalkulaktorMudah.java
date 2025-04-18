/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulaktormudah;

import java.util.Scanner;

/**
 *
 * @author Ayu Sucandra
 */
public class KalkulaktorMudah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;
        
        do {
            System.out.println("\nKalkulaktor Mudah");
            System.out.println("---------------------");
            
            // Input angka pertama
            System.out.print("Masukkan Bilangan Pertama: ");
            double angka1 = scanner.nextDouble();
            
            // Input operator
            System.out.print("Masukkan Operasi Perhitungan (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);
            
            // Input angka kedua
            System.out.print("Masukkan Bilangan Kedua: ");
            double angka2 = scanner.nextDouble();
            
            double hasil = 0;
            boolean operatorValid = true;
            
            // Proses perhitungan
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                        operatorValid = false;
                    }
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Error: Operator tidak valid!");
                    operatorValid = false;
            }
            
            // Tampilkan hasil jika operator valid
            if (operatorValid) {
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            }
            
            // Tanya apakah ingin lanjut
            System.out.print("\nMau Mencoba Lagi??? (y/n): ");
            lanjut = scanner.next();
            
        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println("Terima kasih telah menggunakan kalkulator ini!");
        scanner.close();
    }
}
