
package praktikummodul6;

public class No_1 {

    public static void main(String[] args) {
        int[][] tabel={
            {1,2,3,4},
            {5,6,7,8}
        };
        System.out.println("jumlah baris = "+tabel.length);
        System.out.println("jumlah kolom = "+tabel[0].length);
        System.out.println();
        
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[0].length; j++) {
                System.out.print(tabel[i][j]+" ");
                
            }System.out.println();
        }
    }
    
}
