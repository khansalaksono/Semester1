//https://www.hackerrank.com/contests/uap-pemdas-tif-g/challenges/robot-pengumpul-permen

import java.io.*;
import java.util.*;

public class RobotPengumpulPermen {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] permen = new int[N][N];
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                permen[i][j] = input.nextInt();
            }
        }
        
        System.out.println(permenmaks(permen, 0, N-1));
    }

    static int permenmaks(int[][] permen, int i, int j) {
        if (i==(permen.length-1) && j==0) {
            return permen[i][j];
        } 
        
        else if (j==0) {
            return permen[i][j] + permenmaks(permen, i+1, j);
        } 
        
        else if (i==(permen.length-1)) {
            return permen[i][j] + permenmaks(permen, i, j-1);
        }
        
        return permen[i][j] + Math.max(permenmaks(permen, i+1, j), permenmaks(permen, i, j-1));
    }
}
