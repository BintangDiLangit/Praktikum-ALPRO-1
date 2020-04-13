package praktikummodul6;

import java.util.Arrays;
import javax.swing.JOptionPane;
public class No_4 {

    public static void main(String[] args) {
        int[][] matrix_a = new int[2][2];
        
        int[][] matrix_b = new int[2][2];

        System.out.println("Array 1===================");
        for (int i = 0; i < matrix_a.length; i++) {
            for (int k = 0; k < matrix_a[i].length; k++) {                
            
            matrix_a[i][k] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + i+", "+k));
            
            System.out.println("Index Ke " + i+", "+k + " adalah " + matrix_a[i][k]);

            
            System.out.println("Index ke-"+(matrix_a[i][k]));
        }
        
        }
        printArray(matrix_a);
        
        
        //.fheaufhfhesahjfhseahlfejlsf
        System.out.println("Array 2===================");
        for (int i = 0; i < matrix_b.length; i++) {
            for (int k = 0; k < matrix_b[i].length; k++) {                
            
            matrix_b[i][k] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + i+", "+k));
            
            System.out.println("Index Ke " + i+", "+k + " adalah " + matrix_b[i][k]);

            
            System.out.println("Index ke-"+(matrix_b[i][k]));
        }
        
        }
        printArray(matrix_b);
        

        
        System.out.println("==========Jumlah Matrix Array==========");
        
        System.out.println("=======Jumlah Array di Public=======");
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;
        
        int[][] hasil = new int[baris_a][kolom_a];

        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_a; j++) {
                hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
            }
        }
        printArray(hasil);
    }
    
    
    
    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                //agar koma cuma 2
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}
