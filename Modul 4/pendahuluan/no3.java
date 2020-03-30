package modul4bintangmh;
import javax.swing.JOptionPane;
public class nomor3 {
    public static void main(String[] args) {
        System.out.println("==========Nomor 3A==========");
        //if-else
        String onk="";
        onk=JOptionPane.showInputDialog("Input Number");
        int z=Integer.parseInt(onk);
        
        if(z>=1&&z<=10){
            System.out.println(z+" = Valid Number");
        }else {
            System.out.println(z+" = Invalid Number");
        }
        
        System.out.println("==========Nomor 3B==========");
        //switch-case
        String onk2="";
        onk2=JOptionPane.showInputDialog("Input Number");
        int y=Integer.parseInt(onk2);
        
        
        switch(y){
            case 1:System.out.println(y+" = Valid Number");break;
            case 2:System.out.println(y+" = Valid Number");break;
            case 3:System.out.println(y+" = Valid Number");break;
            case 4:System.out.println(y+" = Valid Number");break;
            case 5:System.out.println(y+" = Valid Number");break;
            case 6:System.out.println(y+" = Valid Number");break;
            case 7:System.out.println(y+" = Valid Number");break;
            case 8:System.out.println(y+" = Valid Number");break;
            case 9:System.out.println(y+" = Valid Number");break;
            case 10:System.out.println(y+" = Valid Number");break;
            default:System.out.println(y+" = Invalid Number");break;
            
        }
    }
}
