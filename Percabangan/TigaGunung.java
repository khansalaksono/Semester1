//https://www.hackerrank.com/contests/tif-g-percabangan-2/challenges/3-gunung

import java.io.*;
import java.util.Scanner;

public class TigaGunung {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b, c, x, y, z;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        x = a + b; //x = jumlah a dan b
        y = b + c; //y = jumlah b dan c
        z = c + a; //z = jumlah c dan a
        
        if(x <= y && x <= z){ //jika x lebih kecil dari y dan z, maka x jarak minimum
            System.out.println(x);
        } else if (y <= x && y <= z){ //jika y lebih kecil dari x dan z, maka y jarak minimum
            System.out.println(y);
        } else if (z <= x && z <= y){ //jika z lebih kecil dari x dan y, maka z jarak minimum
            System.out.println(z);
        }
    }
}
