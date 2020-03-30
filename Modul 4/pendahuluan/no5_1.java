package modul4bintangmh;
import javax.swing.JOptionPane;
public class nomor5_1 {
    public static void main(String[] args) {
        System.out.println("==========Bagian 1==========");
        String angka=JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan");
        int n=Integer.parseInt(angka);
        for(int h=1;h<=n;h++){      //h=1 karena agar menginputkannya mulai dari 1 juga
            for(int i=1;i<=h;i++){
                System.out.print("*");    
            }
            for(int k=4;k>=0;k--){
                System.out.print("  ");
            }
            for(int j=n;j>=h;j--){
                System.out.print("*");
            }    
        System.out.println();
        }
        
        System.out.println("==========Bagian 2==========");
        String angka2=JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan");
        int n2=Integer.parseInt(angka2);
        for(int h2=1;h2<=n2;h2++){
            for(int i2=n2;i2>=h2;i2--){
                System.out.print("*");    
            }
            System.out.print("\t\t");
            
            for(int j2=n2;j2>=h2;j2--){
                System.out.print("*");
            }    
        System.out.println();
        }
    }
}


