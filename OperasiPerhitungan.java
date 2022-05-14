//https://www.hackerrank.com/contests/tif-g/challenges/operasi-perhitungan

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int d = (a*a*a);
        int e = (c*c);
        int f = (d+b);
        int g = (f/e);
        
        int output = g;
        
        System.out.println(output);
    }
}
