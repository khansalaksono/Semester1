//https://www.hackerrank.com/contests/tif-g-perulangan-2/challenges/kartu-hasil-studi-khs

import java.io.*;
import java.util.Scanner;

public class KartuHasilStudi {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int matKul = input.nextInt(); //banyak mata kuliah
        String namaMK;
        int sks;
        double nilai;
        int jumlah1 = 0;
        double jumlah2 = 0.0;
        double iPK = 0.0;
        
        for (int i = 0;i < matKul;i++){
            namaMK = input.next(); //nama mata kuliah
            sks = input.nextInt(); //sks bil bulat positif
            nilai = input.nextDouble(); //nilai bil desimal
            jumlah1 = jumlah1 + sks; //jumlah sks
            jumlah2 = jumlah2 + (sks*nilai); //jumlah sks x nilai
        } 
        iPK = (jumlah2 / jumlah1);
        System.out.printf("IP Semester: %.2f\n", iPK);
        
        String beban;
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
        
        System.out.printf("Beban Studi: maksimum %s sks\n", beban);
    }
}
