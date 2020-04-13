package praktikummodul7;

public class bacaKonsol2 {

    public static void main(String[] args) {
        System.out.print("data1 = ");
        inputconsole ic=new inputconsole();
        int data1=ic.readInt();
        System.out.print("data2 = ");
        int data2=ic.readInt();
        int data3=data1+data2;
        System.out.println("data1 + data2 =  "+data3);
        
        
        //tabung
        Tabung_1 tb=new Tabung_1();
        System.out.println("Input Jari2 = ");
        int jari=ic.readInt();
        System.out.println("Input Tinggi = ");
        int t=ic.readInt();
               
        System.out.println(tb.tabung(jari, t));
        
        
    }
}
