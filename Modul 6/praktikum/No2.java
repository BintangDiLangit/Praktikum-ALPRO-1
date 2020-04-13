package praktikummodul6;
import javax.swing.JOptionPane;
public class No_2 {

    public static void main(String[] args) {
        int data2[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.print("\n");
        }
        int a = 0;
        while (a < data2.length) {
            int b = 0;
            while (b < data2[a].length) {
                System.out.print(data2[a][b]);
                b++;
            }
            a++;
            System.out.println();
        }
        System.out.println("==========================");
        int c = 0;
        do {
            int d = 0;
            do {
                System.out.print(data2[c][d]);
                d++;

            } while (d < data2[c].length);
            c++;

            System.out.println();} while (c < data2.length);
        System.out.println("======================");
        float jumlah = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                jumlah += data2[i][j];
                if (jumlah == data2[i][j]) {
                    System.out.println("Isinya" + data2[i][j]);
                }
            }
            System.out.print("\n");

        }
        System.out.println("jumlah = " + jumlah);
        System.out.println("rata2 = " + jumlah / 16);
        
        String in = "";
        int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element" + in));

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (input == data2[i][j]) {
                    System.out.println(input + " posisi index = " + i + ", " + j);
                }
            }
        }

        int find = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element yang diubah"));
        int change = Integer.parseInt(JOptionPane.showInputDialog("Perubahannya"));

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[i][j] == find) {
                    data2[i][j] = change;
                }
            }
        }
        System.out.println("");
        System.out.println("=====================");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.println("Index ke-" + i + j + " adalah = " + data2[i][j]);
            }
        }
       System.out.println("======================");
        float jumlah3 = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {    
         if (j%2==1) {
           jumlah3+=data2[i][j];
                    
         }
//            System.out.print(jumlah3);
         }
        }
        System.out.println("Isinya " + jumlah3); 
        
    }
}
