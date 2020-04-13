package bintang.modul5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Nomor3 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double j = 0;
        double rata2;
        String A, B;
        try {
            System.out.println("Input Panjang Array");
            A = dataIn.readLine();
            int lol = Integer.parseInt(A);
            int[] aray = new int[lol];
            float jumlah5 = 0;
            for (int c = 0; c < aray.length; c++) {

                System.out.println("Masukkan Index ke-" + c);
                B = dataIn.readLine();
                aray[c] = Integer.parseInt(B);
                j += aray[c];
                if (c % 2 == 0) {
                    jumlah5 += aray[c];
                }

            }

            int min = aray[0];
            int maks = aray[0];
            int index_min = 0;
            int index_maks = 0;
            for (int i = 1; i < aray.length; i++) {
                if (aray[i] > maks) {
                    maks = aray[i];
                    index_maks = i;
                }
                if (aray[i] < min) {
                    min = aray[i];
                    index_min = i;
                }

            }
            float jumlah = 0;
            for (int i = 0; i < aray.length; i++) {
                jumlah += aray[i];
                if (i % 2 == 0) {
                    jumlah += aray[i];
                }
            }

            float rata3 = jumlah5 / 3;// iki di perbaiki sek
            System.out.println("Nilai Min = " + min + "|| Index = " + index_min);
            System.out.println("Nilai Max = " + maks + "|| Index = " + index_maks);

            System.out.println("Jumlah nya adalah = " + j);
            rata2 = j / aray.length;
            System.out.println("Maka rata2 nya adalah = " + rata2);
            System.out.println("Jumlah Bil Genap =" + jumlah5);
            System.out.println("Rata-rata Genap = " + rata3);
            if (jumlah5 % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }

            Arrays.sort(aray);
            for (int i = 0; i < aray.length; i++) {
                System.out.print(aray[i] + " ,");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
