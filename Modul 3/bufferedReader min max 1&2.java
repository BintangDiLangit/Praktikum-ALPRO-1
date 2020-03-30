/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author BintangDiLangit
 */
public class No_1_and_2 {

    public static void main(String[] args) {
        // TODO code application logic here

        // NO 1 =========================================
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a, b, c;
            System.out.print("Masukkan data pertama: ");
            a = Integer.parseInt(input.readLine());
            System.out.print("Masukkan data kedua: ");
            b = Integer.parseInt(input.readLine());
            System.out.print("Masukkan data ketiga: ");
            c = Integer.parseInt(input.readLine());

            System.out.println(a + ", " + b + ", " + c + ", ");

            // NO 2 =========================================
            int max=0;
            if (a > b && a > c) {
                max = a;
            } else if (b > a && b > c) {
                max = b;
            } else if (c > a && c > b) {
                max = c;
            }

            int min=0;
            if (a < b && a < c) {
                min = a;
            } else if (b < a && b < c) {
                min = b;
            } else if (c < a && c < b) {
                min = c;
            }
            
            System.out.println("Nilai terbesar: "+max);
            System.out.println("Nilai terkecil: "+min);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

