package modul4bintangmh;
import javax.swing.JOptionPane;
public class nomor4 {
    public static void main(String[] args) {
        System.out.println("==========Input Pertama==========");
        int a=0;
        String input,input1,input2;
        input =JOptionPane.showInputDialog("Input Number");
        int b=Integer.parseInt(input);
        
        if(b%2==0){
            System.out.println(b+" = Genap");
        }else if(b%2==1){
            System.out.println(b+" = Ganjil");
        }
        System.out.println("Jumlah = "+b);
        
        System.out.println("==========Input Kedua==========");
        input1 =JOptionPane.showInputDialog("Input Number");
        int c=Integer.parseInt(input1);
        
        if(c%2==0){
            System.out.println("+"+c+" = Genap");
        }else if(c%2==1){
            System.out.println("+"+c+" = Ganjil");
        }
        int jumlah1=b+c;
        System.out.println("Jumlah = "+jumlah1);
        
        System.out.println("==========Input Ketiga==========");
        input2 =JOptionPane.showInputDialog("Input Number");
        int d=Integer.parseInt(input2);
        
        if(d%2==0){
            System.out.println("+"+d+" = Genap");
        }else if(d%2==1){
            System.out.println("+"+d+" = Ganjil");
        }
        int jumlah2=jumlah1+c;
        System.out.println("Jumlah = "+jumlah2);
        System.out.println("==========Maka==========");
        if(jumlah2%2==0){
            System.out.println(jumlah2+" = Genap");
        }else if(jumlah2%2==1){
            System.out.println(jumlah2+" = Ganjil");
        }
    }
}
