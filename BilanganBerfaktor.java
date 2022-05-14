//https://www.hackerrank.com/contests/tif-g-perulangan/challenges/bilangan-berfaktor

import java.io.*;
import java.util.Scanner;

public class BilanganBerfaktor {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int tambah = 0;
        int i;
        for (i = 1; i <= N; i++){
            if (N % i==0) 
                tambah++;
        }
        System.out.println(tambah);

        for (i = N; i>=1; i--){
            if (N%i==0) 
            System.out.printf("%d ", i);
        }
    }
}
