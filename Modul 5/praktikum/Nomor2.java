package bintang.modul5;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Nomor2 {

    public static void main(String[] args) {
        int j = 0;
        int data[] = new int[5];
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + a));

            System.out.println("Index Ke " + a + " adalah " + data[a]);

            j += data[a];
        }
        System.out.println("Index"+Arrays.toString(data));
        
        System.out.println("Jumlah =" + j);
        int x = j / 5;
        System.out.println("Rata-rata = " + x);

        int min = data[0];
        int maks = data[0];
        int idxtb =0,idxtk=0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
                idxtb=i;
            }
            if (data[i] < min) {
                min = data[i];
                idxtk=i;
            }
        }
        
        System.out.println("Nilai Max = " + maks);
        System.out.println("Nilai Min = " + min);
        System.out.println("Index  max ke-"+idxtb);
        System.out.println("Index  max ke-"+idxtk);
        
        
        
        int find=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element yang diubah"));
        int change=Integer.parseInt(JOptionPane.showInputDialog("Perubahannya"));
        
        for (int v = 0; v < data.length; v++) {
            if(data[v]==find){
                data[v]=change;
                System.out.println("Index Berapa yang diganti"+v);}
            
        }
        System.out.println("");
        System.out.println("=====================");
        for (int i = 0; i < data.length; i++) {
                System.out.println("Index ke-"+i+"adalah"+data[i]);
            }
     
        
//        for (int b = 0; b < data.length; b++) {
//            data[b]=Integer.parseInt(JOptionPane.showInputDialog("Input perubahan index ke-"+b));
//            System.out.println("Index ke-"+b+" perubahan "+data[b]);
//            
//        }
//        System.out.println("Index Perubahan"+Arrays.toString(data));
        
    }
}
