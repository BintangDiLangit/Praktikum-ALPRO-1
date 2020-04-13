package TPmodul6;

import javax.swing.JOptionPane;

public class TP4 {
    public static void main(String[] args) {
        int index=Integer.parseInt(JOptionPane.showInputDialog("Input Element"));
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,5,2,8,8,2,10}};
        
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if(index==data2[i][j]){
                    System.out.println(index+" posisi index"+i+j);
                }
            }
        }
    }
        
}
