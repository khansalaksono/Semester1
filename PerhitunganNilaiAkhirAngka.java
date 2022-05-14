//https://www.hackerrank.com/contests/tif-g-kasus/challenges/kasus-2-1-perhitungan-nilai-akhir-angka/problem

import java.io.*;
import java.util.Scanner;

public class Solution {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        String nama = in.nextLine(); //nama mahasiswa
        
        //nilai-nilai
        double tugas = in.nextDouble();
        double kuis = in.nextDouble();
        double UTS = in.nextDouble();
        double UAS = in.nextDouble();
        double keaktifan = in.nextDouble();
        
        /*10% tugas
          20% kuis
          30% UTS
          30% UAS
          10% keaktifan */
        
        double a = tugas * 10/100;
        double b = kuis * 20/100;
        double c = UTS * 30/100;
        double d = UAS * 30/100;
        double e = keaktifan * 10/100;
        
        double nilai = (a + b + c + d + e); //hasil perhitungan
        
        System.out.printf("Nilai akhir " + nama + " adalah %.2f", nilai); 
    }
}
