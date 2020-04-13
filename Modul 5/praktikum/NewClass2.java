
package praktikummodul5;

import javax.swing.JOptionPane;

public class NewClass2 {
    public static void main(String[] args) {
        
int j=0;
        int data[]=new int[5];
        for(int a=0;a<data.length;a++){
            data[a]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke "+a));

            System.out.println("Index Ke "+a+" adalah "+data[a]);
       
        
     j+=data[a];}
            System.out.println("Jumlah ="+j);
            int x=j/5;
            System.out.println("Rata-rata = "+x);
            
          
        int min = data[0];
        int maks = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(min);
        System.out.println(maks);
    }
}
