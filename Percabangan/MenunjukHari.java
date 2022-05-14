//https://www.hackerrank.com/contests/tif-g-percabangan-2/challenges/menunjuk-hari

import java.io.*;
import java.util.Scanner;

public class MenunjukHari {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i; //input hari ke-i
        i = input.nextInt();
        
        /* Minggu adalah hari pertama
        misal ditanya hari ke-10
        10 dibagi 7 hasilnya 1 sisa 3
        hari ke-3 ialah Selasa, maka jawabannya Selasa */
        
        if(i % 7 == 1) {                //sisa 1 maka hari pertama
           System.out.println("Minggu"); 
        } else if (i % 7 == 2){         //sisa 2 maka hari kedua
            System.out.println("Senin");
        } else if (i % 7 == 3){         //sisa 3 maka hari ketiga
            System.out.println("Selasa");
        } else if (i % 7 == 4){         //sisa 4 maka hari keempat
            System.out.println("Rabu");
        } else if (i % 7 == 5){         //sisa 5 maka hari kelima
            System.out.println("Kamis");
        } else if (i % 7 == 6){         //sisa 6 maka hari keenam
            System.out.println("Jumat");
        } else if (i % 7 == 0){         //sisa 0 (habis dibagi) maka hari ketujuh
            System.out.println("Sabtu");
        } 
    } 
}
