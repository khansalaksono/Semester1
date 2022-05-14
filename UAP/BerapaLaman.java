//https://www.hackerrank.com/contests/uap-pemdas-tif-g/challenges/berapa-laman

import java.io.*;
import java.util.*;

public class BerapaLaman {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int banyaklaman = input.nextInt();
        int yangaktif = input.nextInt();
        int range = input.nextInt();
        
        int a = range/2;
        int min = yangaktif-a;
        int max = yangaktif+a;
        
        if(min < 1)
            min = 1;
        if(yangaktif-1 >= 1){
            System.out.print("Prev ");
        }
        
        if(min>=1&&max<=banyaklaman){
            for(int i=0 ; i <= range ; i++){
                System.out.printf("%s ", min);
                min++;
            }
        } else if(max>banyaklaman){
            max=banyaklaman-range;
            for(int i=0 ; i <= range ; i++){
                System.out.printf("%s ", max);
                max++;
            }
        }
        
        if(yangaktif+1 <= banyaklaman){
            System.out.print("Next ");
        }
    }
}
