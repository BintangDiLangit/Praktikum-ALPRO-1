
package praktikum.modul.pkg8;

import java.awt.*;
import javax.swing.*;

class CobaGUI_1 extends JFrame{
    Button cb1=new Button("Pilih A");
    Button cb2=new Button("Pilih B");
    
    CobaGUI_1(){
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.green);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String[] args) {
        CobaGUI_1 ZZ=new CobaGUI_1();
        ZZ.objek();
    }
}
