/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tebakangka;

/**
 *
 * @author Ayu Sucandra
 */
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate angka acak antara 1-100
        int angkaYangHarusDitebak = random.nextInt(100) + 1;
        int tebakan;
        int jumlahPercobaan = 0;
        
        System.out.println("Permainan Tebak Angka (1-100)");
        System.out.println("Ketik 0 jika ingin keluar");
        System.out.println("------------------------------");
        
        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            jumlahPercobaan++;
            
            if (tebakan == 0) {
                System.out.println("Anda memilih keluar. Angka yang dicari adalah " + angkaYangHarusDitebak);
                break;
            } else if (tebakan < angkaYangHarusDitebak) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakan > angkaYangHarusDitebak) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Selamat! Anda menebak benar dalam " + jumlahPercobaan + " percobaan.");
            }
            
        } while (tebakan != angkaYangHarusDitebak);
        
        scanner.close();
    }
}
