//https://www.hackerrank.com/contests/uap-pemdas-tif-g/challenges/frekuensi-karakter-1

import java.io.*;
import java.util.*;

public class FrekuensiKarakter {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        int[] frekuensi = new int[kalimat.length()];
        
        char karakter[] = kalimat.toCharArray();
        Arrays.sort(karakter);
        
        int nilai;
        char huruf;
        String cek = "";
            for (int i = 0; i < karakter.length; i++) {
                nilai = 0;
                huruf = karakter[i];
                if(!cek.contains("" + huruf)){
                    for (int j = i ; j < karakter.length ; j++) {
                        if(huruf == karakter[j]){
                            nilai += 1;
                        }
                    }
                    System.out.printf("%c%c %d\n", huruf, ':', nilai);
                    cek+=huruf;
                }
            }
    }
}
