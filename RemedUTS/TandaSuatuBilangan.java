//https://www.hackerrank.com/contests/remed-asikkk/challenges/tanda-suatu-bilangan

import java.io.*;
import java.util.*;

public class TandaSuatuBilangan {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double N;
        N = input.nextDouble();
        
        if (N < 0){
            System.out.print("negatif");
        } else if (N == 0){
            System.out.print("nol");
        } else {
            System.out.print("positif");
        }
    }
}
