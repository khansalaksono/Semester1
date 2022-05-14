//https://www.hackerrank.com/contests/uts-tif-g/challenges/jarakmanhattan

import java.io.*;
import java.util.Scanner;

public class Solution {
    // NAMA    : KHANSA SALSABILA SANGDIVA LAKSONO
    // NIM     : 215150201111068
    // Dilarang menggunakan array, looping, dan method.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double x1, y1, x2, y2, x, y, jarak;
        x1 = input.nextDouble(); 
        y1 = input.nextDouble(); 
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        jarak = Math.abs(x2 - x1)+Math.abs(y2 - y1);
        
        /*
        x = (x2 - x1)*(x2 - x1);
        y = (y2 - y1)*(y2 - y1);
        jarak = Math.sqrt(x + y);
        
        jarak = (Math.ceil(jarak)) + 1; */
        System.out.printf("%.0f", jarak); 
    }
}
