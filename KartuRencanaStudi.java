//https://www.hackerrank.com/contests/tif-g-percabangan-2/challenges/kartu-rencana-studi

import java.io.*;
import java.util.Scanner;

public class Solution {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, nim, prodi, matkul1, matkul2, matkul3, matkul4, matkul5;
        int sks1, sks2, sks3, sks4, sks5, sksTotal;
        nama = input.nextLine(); 
        nim = input.nextLine();
        prodi = input.nextLine();
        matkul1 = input.nextLine();
        matkul2 = input.nextLine();
        matkul3 = input.nextLine();
        matkul4 = input.nextLine();
        matkul5 = input.nextLine();
        sks1 = input.nextInt();
        sks2 = input.nextInt();
        sks3 = input.nextInt();
        sks4 = input.nextInt();
        sks5 = input.nextInt();
        input.close();
        
        sksTotal = sks1 + sks2 + sks3 + sks4 + sks5;
        
        /*
        "%-ns" untuk String, rata kiri selebar n
        "%c" untuk char/karakter tunggal 
        "%s" untuk String
        "\n" untuk new line
        */
        
        System.out.printf("%-15s%c %s\n", "Nama", ':', nama);
        System.out.printf("%-15s%c %s\n", "NIM", ':', nim);
        System.out.printf("%-15s%c %s\n", "Program Studi", ':', prodi);
        System.out.printf("%-15s%c %s\n", "Semester", ':', "Ganjil 2020/2021");
        System.out.printf("-----------------------------------\n");
        System.out.printf("%-4s%-27s%s\n", "No", "Nama Mata Kuliah", "SKS");
        System.out.printf("%-4s%-27s%-3s\n", "1", matkul1, sks1); 
        System.out.printf("%-4s%-27s%-3s\n", "2", matkul2, sks2); 
        System.out.printf("%-4s%-27s%-3s\n", "3", matkul3, sks3); 
        System.out.printf("%-4s%-27s%-3s\n", "4", matkul4, sks4); 
        System.out.printf("%-4s%-27s%-3s\n", "5", matkul5, sks5); 
        System.out.printf("-----------------------------------\n");
        System.out.printf("%-4s%-27s%-3s\n", "", "SKS Total", sksTotal);
    }
} 
