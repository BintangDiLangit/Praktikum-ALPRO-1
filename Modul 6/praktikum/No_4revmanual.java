package praktikummodul6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class No_4revmanual {

    public static void main(String[] args) {
        int data[][] = {
            {2, 9, 5, 17},
            {1, 5, 10, 4}


        };
        int m = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element"));
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (m == data[i][j]) {
                    System.out.println("Index = [" + i + "],[" + j + "]");
                }
            }
        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(data[i][j]+data[i][j+2]);
//            }
//            System.out.println("");
//        }
}
}



//        int data2[][] = {{data[0][0] + data[1][0]}, {data[0][1] + data[1][1]}, 
//            {data[0][2] + data[1][2]}, {data[0][3] + data[1][3]}};
//        System.out.println(Arrays.deepToString(data2));
    


//     private static void printArray(int[][] dataArray) {
//        int baris = dataArray.length;
//        int kolom = dataArray[0].length;
//        for (int i = 0; i < baris; i++) {
//            System.out.print("[");
//            for (int j = 0; j < kolom; j++) {
//                System.out.print(dataArray[i][j]);
//                //agar koma cuma 2
//                if (j < (kolom - 1)) {
//                    System.out.print(",");
//                } else {
//                    System.out.print("]");
//                }
//            }
//            System.out.print("\n");
//        }
//        System.out.println("\n");
//}
