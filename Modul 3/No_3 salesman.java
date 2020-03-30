/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul3;

import javax.swing.JOptionPane;

/**
 *
 * @author BintangDiLangit
 */
public class No3_salesman {
    public static void main(String[] args) {
        double pendapatan=0;
        double penjualan=0;
        double jasa=0;
        double komisi=0;
        System.out.println("Masukkan hasil penjualan: ");
        penjualan = Integer.valueOf(JOptionPane.showInputDialog(""));
        
        if (penjualan==2000000) {
            jasa = 100000;
        }else if (penjualan>2000000||penjualan<=5000000) {
            jasa = 200000;
        }else if (penjualan>5000000) {
            jasa = 300000;
        }else{
            System.out.println("Tidak dapat gaji");
        }
        
        if (penjualan==2000000) {
            komisi = jasa*0.1 ;
        }else if (penjualan>2000000||penjualan<=5000000) {
            komisi = jasa*0.15;
        }else if (penjualan>5000000) {
            komisi = jasa*0.2;
        }else{
            System.out.println("Tidak dapat gaji");
        }
        
        pendapatan = komisi+jasa;
        
        System.out.println("Rp."+pendapatan);
    }
}
