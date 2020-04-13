
package praktikummodul6;

public class No_1_2 {
    public static void main(String[] args) {
        int data2[][]={
            {4,6,4,2,8,4,2,10},
            {4,6,4,2,8,4,2,10}
        };
        
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
