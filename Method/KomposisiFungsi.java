//https://www.hackerrank.com/contests/tif-g-method/challenges/komposisifungsi

import java.io.*;
import java.util.*;

public class KomposisiFungsi {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A, B, K, x, fungsiK;
        A = input.nextInt();
        B = input.nextInt();
        K = input.nextInt();
        x = input.nextInt();
        fungsiK = fungsix(A, B, x);
            
        for(int i = 1; i < K; i++){
            fungsiK = fungsix(A, B, fungsiK);
        }
        
        System.out.print(fungsiK);   
    }
    
    public static int fungsix(int A, int B, int x){
            return (A * x) + (B - A)*x;
        }
}
