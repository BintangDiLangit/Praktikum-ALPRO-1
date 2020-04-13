/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul5;

import javax.swing.JOptionPane;

/**4
 *
 * @author str5
 */
public class NewClass3 {
    public static void main(String[] args) {
        int j=0;
        int length = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array: "));
        int [] arr = new int[length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai dari indeks ke-"+i));
       
        j+=arr[i];
        }
        
   
        
        
        int min = arr[0];
        int maks = arr[0];
        int index_min = 0;
        int index_maks = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maks) {
                maks = arr[i];
                index_maks = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            }
        }
        System.out.println("Nilai Min = "+min + "|| Index = " + index_min);
        System.out.println("Nilai Max = "+maks + "|| Index = " + index_maks);
        
        System.out.println("Jumlah nya adalah = "+j);
        double rata2=j/arr.length;
        System.out.println("Maka rata2 nya adalah = "+rata2);
    }
}
