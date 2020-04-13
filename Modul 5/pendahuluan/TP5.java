package modul5;

public class TP5_1 {
    public static void main(String[] args) {
        
        //while
        int[] dataAngka = {4, 6, 4, 2, 8, 4, 2, 11};
        int a=0;
        while(a<dataAngka.length){
            System.out.println(dataAngka[a]);a++;
        }
        
        System.out.println("==================================");
        //do while
        int[] dataAngka2 = {4, 6, 4, 2, 8, 4, 2, 11};
        int b=0;
        do{System.out.println(dataAngka2[b]);b++;
        
    }
        while(b<dataAngka2.length);
        
        //for loop
        System.out.println("==================================");
        for (int c = 0; c < dataAngka.length; c++) {
            System.out.println(dataAngka[c]);
          
        }
        int[] array = {4, 6, 4, 2, 8, 4,2,11};
       int sum = 0;
       //Advanced for loop
       for( int num : array) {
           sum = sum+num;
       }
       System.out.println("Jumlah Dari Semua Elemen Array Adalah:"+sum);
          
        }
            
        
        
    }
