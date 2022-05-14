//https://www.hackerrank.com/contests/remed-asikkk/challenges/nilai-tempat

import java.io.*;
import java.util.*;

public class NilaiTempat {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N;
        N = input.nextInt();
        
        if (N < 10){
            System.out.print("satuan");
        } else if (N < 100){
            System.out.print("puluhan");
        } else if (N < 1000){
            System.out.print("ratusan");
        } else if (N < 10000){
            System.out.print("ribuan");
        } else {
            System.out.print("puluhribuan");
        }
    }
}
