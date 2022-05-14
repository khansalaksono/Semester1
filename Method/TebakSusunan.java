//https://www.hackerrank.com/contests/tif-g-method/challenges/tebak-susunan

import java.io.*;
import java.util.*;

public class TebakSusunan {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N, T, P, Q;
        N = input.nextInt(); //di soal = 3

        String bola[][] = new String[2][N]; //2 baris 3 kolom

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                bola[i][j] = input.next(); //loop 1 = A B C, loop 2 = X Y Z
            }
        }
        input.nextLine(); //agar inputan bisa pakai spasi
        
        T = input.nextInt(); //di soal = 2
        
        String temp; //variabel penyimpanan sementara
        for (int i = 0; i < T; i++) {
            P = input.nextInt(); //loop 1 = 1, loop 2 = 2
            Q = input.nextInt(); //loop 1 = 3. loop 2 = 2

            penukaran(bola, P, Q); //method
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(bola[i][j]+" "); //print hasil penukaran
            }
            System.out.println(); 
        }
    }
    
    public static void penukaran(String bola[][],int P, int Q){
        String temp ;
        temp = bola[0][P-1];
        bola[0][P-1] = bola[1][Q-1];
        bola[1][Q-1] = temp;
    }
}
