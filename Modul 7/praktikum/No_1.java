
package praktikummodul7;

public class No_1 {  
    //Contoh 1
    
    private void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas=panjang*lebar;
        System.out.println("===============Segi Empat================");
        System.out.println("Panjang Segi Empat = "+panjang);
        System.out.println("Lebar Segi Empat = "+lebar);
        System.out.println("Luas Segi Empat = "+luas);
    }
    public static void main(String[] args) {
        
        No_1 se=new No_1();
        se.segiempat(10,5);

    }
    
   
}


