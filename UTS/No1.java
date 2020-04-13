/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BintangDiLangit
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String tipe_pelanggan = "";
        String jawaban = "";
        boolean loop = true;
        while (loop){
            // input nilai        
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("apakah pelanggan baru atau lama ? (baru/lama)");
            tipe_pelanggan = input.readLine();//menyimpan nilai

            //pelanggan lama
            if (tipe_pelanggan.equals("lama")) {
                System.out.print("jumlah fotokopi = ");
                int jumlah = Integer.parseInt(input.readLine());
                int harga = 75;
                int hasil = harga * jumlah;

                System.out.println("jumlah fotokopi = " + jumlah);
                System.out.println("total harga = " + hasil);
            } else if (tipe_pelanggan.equals("baru")) {
                System.out.print("jumlah fotokopi = ");
                int jumlah = Integer.parseInt(input.readLine());
                int harga = 0;
                // percabangan untuk mendapatkan harga
                if (jumlah < 100) {
                    harga = 150;
                } else if (jumlah == 100 || jumlah <= 200) {
                    harga = 100;
                } else if (jumlah > 200) {
                    harga = 80;
                }

                int hasil = jumlah * harga;

                System.out.println("dapat harga = " + harga);
                System.out.println("total harga = " + hasil);

                
            }
            System.out.println("Lanjut Program ? (y/t) ");
            String program=input.readLine();
            if(program.equals("t")){
                loop=false;
            }else if(program.equals("y")){
                loop=true;
            }else{
                loop=false;
            }
        }
    }
}
