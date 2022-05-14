//https://www.hackerrank.com/contests/tif-g-array/challenges/input-khs

import java.io.*;
import java.util.*;

public class Solution {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int jumlah1 = 0;
        double jumlah2 = 0.0;
        double iPK = 0.0;
        String beban;
        
        String namaMK[] = new String[n];
        int sks[] = new int[n];
        double nilai[] = new double [n];
        double[] ns = new double[n];
        
        for(int i = 0; i < n; i++){
            namaMK[i] = input.next(); //input kode mk
            sks[i] = input.nextInt(); //input sks
            nilai[i] = input.nextDouble(); //input nilai
            
            jumlah1 += sks[i]; //jumlah sks
            jumlah2 += (sks[i]*nilai[i]); //jumlah sks x nilai
            ns[i] = (sks[i]*nilai[i]); //nilai x sks
            
            System.out.printf("%d. %s %d %.1f %.2f\n", i+1, namaMK[i], sks[i], nilai[i], ns[i]);
        }
        iPK = (jumlah2 / jumlah1); //rumus ipk
        System.out.printf("IP Semester: %.2f\n", iPK);
        
        if(iPK >= 3.00){
            beban = "24";
        } else if (iPK >= 2.5 && iPK <= 2.99){
            beban = "21";
        } else if (iPK >= 2.0 && iPK <= 2.49){
            beban = "18";
        } else if (iPK >= 1.5 && iPK <= 1.99){
            beban = "15";
        } else {
            beban = "12";
        }
        System.out.printf("Beban Studi: maksimal %s sks\n", beban); 
    }
}
