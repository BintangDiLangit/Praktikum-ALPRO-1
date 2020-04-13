package modul5;

import javax.swing.JOptionPane;

public class TP4 {

    public static void main(String[] args) {
        int[] dataAngka = {4, 6, 4, 2, 8, 4, 2, 11};
        String a;
        
        int b=Integer.parseInt(JOptionPane.showInputDialog("Input The Element"));
        for (int c = 0; c < dataAngka.length; c++) {
            if (dataAngka[c] == b) {
                System.out.println("Index ke-" + c);  
            }
            //System.out.println("Index ke-" + c);
        }

    }
}
