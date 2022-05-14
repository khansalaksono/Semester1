//https://www.hackerrank.com/contests/tif-g-perulangan/challenges/si-sulung-si-bungsu

import java.io.*;
import java.util.Scanner;

public class SiSulungSiBungsu {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int age = 0;
        int sulung = 0;
        int bungsu = 0; 
        int i;
        for(i = 0;i < N;i++){
            age = input.nextInt();
            if(i == 0) 
            bungsu = age;
            if (age > sulung) 
            sulung = age;
            else if (age < bungsu)
            bungsu = age;
            }
            System.out.printf("%d %d", sulung, bungsu);
    }
}
