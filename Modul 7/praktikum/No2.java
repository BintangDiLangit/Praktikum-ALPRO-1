
package praktikummodul7;

import javax.swing.JOptionPane;

public class No2 {
    public static void main(String[] args) {
        int BB, BA, suku;
        
//        BB = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Batas Bawah = "));
        BA = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Batas Atas = "));
        suku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Suku = "));
        
        System.out.println("Hasil sigma = "+ sigma( BA, suku));
    }
    
    public static int sigma( int BA, int suku) {
        int hasil = 0, total = 0;
        
        for (int a = 1; a <= BA; a++) {
            hasil = ((2 * a) + suku);
            total += ((2 * a) + suku);
            System.out.println("(2 * "+a+") + "+suku + "="+hasil);
        }
        
        return total;
    }
}
        
        
        


