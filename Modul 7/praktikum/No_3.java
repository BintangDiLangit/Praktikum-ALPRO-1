package praktikummodul7;

import javax.swing.JOptionPane;

public class No_3 {
  
      public static int InputNilai(String satuan) {
        int nilai = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Nilai "+ satuan));
        
        return nilai;
    }
    
    public static void LPP(int panjang, int lebar) {
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+hasil);
    }
    
    public static void LS(int alas, int tinggi) {
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = "+ hasil);
    }
    
    public static void LL(int jari) {
        double hasil = Math.PI * Math.pow(jari, 2);
        System.out.println("Luas Lingkaran = "+ hasil);
    }
    
}
