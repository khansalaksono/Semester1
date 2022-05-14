//https://www.hackerrank.com/contests/uts-tif-g/challenges/pergi-berbelanja

import java.io.*;
import java.util.Scanner;

public class PergiBerbelanja {
    // NAMA    : KHANSA SALSABILA SANGDIVA LAKSONO
    // NIM     : 215150201111068
    // Dilarang menggunakan array, looping, dan method.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double apel, mangga, jeruk, wortel, kentang, biayaA, biayaM, biayaJ, biayaW, biayaK, hargaA, hargaM, hargaJ,                    hargaW, hargaK, total, diskon, totalD;
        apel = input.nextDouble();
        mangga = input.nextDouble();
        jeruk = input.nextDouble();
        wortel = input.nextDouble();
        kentang = input.nextDouble();
        
        biayaA = 20000; //per kg
        biayaM = 30000; //per kg
        biayaJ = 28000; //per kg
        biayaW = 18000; //per kg
        biayaK = 21000; //per kg
        
        //harga
        hargaA = biayaA * apel;
        hargaM = biayaM * mangga;
        hargaJ = biayaJ * jeruk;
        hargaW = biayaW * wortel;
        hargaK = biayaK * kentang;
        
        double A, M, J, W, K, bayar;
        if (apel > 3){
            A = ((hargaA) - (hargaA * 0.15));
        } else {
            A = hargaA;
        }    
        
        if (mangga > 4){
            M = ((hargaM) - (hargaM * 0.25));
        } else {
            M = hargaM;
        }
            
        if (jeruk > 2){
            J = ((hargaJ) - (hargaJ * 0.12));
        } else {
            J = hargaJ;
        }
            
        if (kentang > 3){
            K = (hargaK - 10000);
        } else {
            K = hargaK;
        } 
        
        total = A + M + J + hargaW + K; 
        
        if(total >= 250000){
            bayar = (total) - (total*0.1);
        } else{
            bayar = total;
        }
        System.out.println("Harga total apel    : Rp" + A);
        System.out.println("Harga total mangga  : Rp" + M);
        System.out.println("Harga total jeruk   : Rp" + J);
        System.out.println("Harga total wortel  : Rp" + hargaW);
        System.out.println("Harga total kentang : Rp" + K);
        System.out.printf("=================================\n");
        System.out.println("Total harga belanja : Rp" + total);
        System.out.println("===================================================");
        System.out.println("Harga yang harus dibayar Pak Dengklek : Rp" + bayar);
        
    }
}
