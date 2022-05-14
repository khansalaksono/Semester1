//https://www.hackerrank.com/contests/percabangan-tif-g/challenges/perhitungan-nilai-akhir-huruf/problem
import java.io.*;
import java.util.Scanner;

public class PerhitunganNilaiAkhirHuruf {
    //NAMA  : KHANSA SALSABILA SANGDIVA LAKSONO
    //NIM   : 215150201111068
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = input.nextLine();
        String a = "- Huruf Mutu : ";
        String b = "- Angka Mutu : ";
        String c = "- Predikat   : ";
       
        double nilaiTugas = input.nextDouble();
        double nilaiKuis = input.nextDouble();
        double nilaiUTS = input.nextDouble();
        double nilaiUAS = input.nextDouble();
        double nilaiKeaktifan = input.nextDouble();
       
        //10% tugas, 20% kuis, 30% UTS, 30% UAS, dan 10% keaktifan
        double nilaiAkhir = (0.1 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS) + (0.1 *                                     nilaiKeaktifan);
           
        System.out.println("Nilai akhir " + nama + ":");
        System.out.printf("- Nilai Akhir: %.2f\n" , nilaiAkhir);
       
        if(nilaiAkhir > 80){
            System.out.println(a + "A");
            System.out.println(b + "4,0");
            System.out.println(c + "Sangat Baik");
        } else if (nilaiAkhir > 75 && nilaiAkhir <= 80){
            System.out.println(a + "B+");
            System.out.println(b + "3,5");
            System.out.println(c + "Lebih Baik");
        } else if (nilaiAkhir > 69 && nilaiAkhir <= 75){
            System.out.println(a + "B");
            System.out.println(b + "3,0");
            System.out.println(c + "Baik");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 69){
            System.out.println(a + "C+");
            System.out.println(b + "2,5");
            System.out.println(c + "Lebih dari Cukup");
        } else if (nilaiAkhir > 55 && nilaiAkhir <= 60){
            System.out.println(a + "C");
            System.out.println(b + "2,0");
            System.out.println(c + "Cukup");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 55){
            System.out.println(a + "D+");
            System.out.println(b + "1,5");
            System.out.println(c + "Lebih dari Kurang");
        } else if (nilaiAkhir > 44 && nilaiAkhir <= 50){
            System.out.println(a + "D");
            System.out.println(b + "1,0");
            System.out.println(c + "Kurang");
        } else {
            System.out.println(a + "E");
            System.out.println(b + "0,0");
            System.out.println(c + "Gagal");
        }
       
    }
}
