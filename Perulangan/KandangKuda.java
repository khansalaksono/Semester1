//https://www.hackerrank.com/contests/tif-g-perulangan/challenges/kandang-kuda

import java.io.*;
import java.util.Scanner;

public class KandangKuda {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int jumlah = 0;
        int i;
        for(i = 0; i < N; i++){
           jumlah = jumlah + input.nextInt();
            
        } System.out.println(jumlah);
    } 
}
