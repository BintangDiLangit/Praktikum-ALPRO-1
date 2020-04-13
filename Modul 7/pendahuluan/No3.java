package TP;
import java.io.*;
public class No3 {
    public static void main(String[] args) {
        System.out.println("Awal Program");
        try{
            System.out.println("Baris ini tidak akan dieksekusi A");
            File f =new File ("hello.txt");
            
            InputStream fis=new FileInputStream(f);
            System.out.println(fis);
            System.out.println("Baris ini tidak akan dieksekusi B");
        }
        
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Baris di dalam finally akan dieksekusi");
        }
    
    }
    
}
