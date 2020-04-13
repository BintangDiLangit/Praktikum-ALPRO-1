package TPmodul6;

public class TP5 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 7, 8, 3, 2, 10}, {4, 6, 5, 2, 8, 8, 2, 1}};

        //while
        int a = 0, b = 0;
        while (a < data.length) {
            b = 0;
            while (b < data[a].length) {
                System.out.println("Isinya = " + data[a][b]);
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println("==========================");
        //do while
        
        int r=0;
        do{ 
            System.out.println("");
        int c=0;
            do{
            System.out.println("Isinya = "+data[r][c]);
            c++;}   
            while(c<data[r].length);
           r++;
        } while(r<data.length);

        System.out.println("==========================");
        //for
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Isinya = " + data[i][j]);
            }
            System.out.println();
        }
    }
}
