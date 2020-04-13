package praktikummodul5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bufferednomor_4 {
    
    public static void main(String[] args) {
        
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    double j=0;
    String A,B;
    try{
        System.out.println("Masukkan Jumlah Array");
        A=dataIn.readLine();
        int wow=Integer.parseInt(A);
        int [] arr = new int[wow];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan Nilai Dari Index ke-"+i);
            B=dataIn.readLine();
            arr[i]=Integer.parseInt(B);
           
            if(i%2==0){
                        
        }
           
           
        j+=arr[i];}
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
    
}catch(IOException e){System.out.println(e);}
    
    }
}
