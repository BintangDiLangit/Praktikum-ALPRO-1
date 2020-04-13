package praktikum.modul.pkg8;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Calculator extends JFrame {

   TextField text = new TextField();
   Button b1 = new Button("1");
   Button b2 = new Button("2");
   Button b3 = new Button("3");
   Button b4 = new Button("4");
   Button b5 = new Button("5");
   Button b6 = new Button("6");
   Button b7 = new Button("7");
   Button b8 = new Button("8");
   Button b9 = new Button("9");
   Button kurang = new Button("-");
   Button bagi = new Button("/");
   Button tambah = new Button("+");
   Button kali = new Button("*");
   Button sd= new Button("=");
   Button c = new Button("C");
   Button nol = new Button("0");
   
   
   Calculator() {
        setTitle("Calculator");
        setLocation(200, 100);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
   void objek(){
       getContentPane().add(text);
       getContentPane().setLayout(null);
       getContentPane().add(b1);
       getContentPane().add(b2);
       getContentPane().add(b3);
       getContentPane().add(b4);
       getContentPane().add(b5);
       getContentPane().add(b6);
       getContentPane().add(b7);
       getContentPane().add(b8);
       getContentPane().add(b9);
       getContentPane().add(kali);
       getContentPane().add(bagi);
       getContentPane().add(kurang);
       getContentPane().add(tambah);
       getContentPane().add(c);
       getContentPane().add(nol);
       getContentPane().add(sd);

       
       getContentPane().setBackground(Color.black);
       
       
       text.setBounds(50,8,190,30);
       b1.setBackground(Color.red);
       b2.setBackground(Color.red);
       b3.setBackground(Color.red);
       tambah.setBackground(Color.red);
       
       b4.setBackground(Color.green);
       b5.setBackground(Color.green);
       b6.setBackground(Color.green);
       kurang.setBackground(Color.green);
       
       b7.setBackground(Color.yellow);
       b8.setBackground(Color.yellow);
       b9.setBackground(Color.yellow);
       kali.setBackground(Color.yellow);
       
       nol.setBackground(Color.pink);
       c.setBackground(Color.pink);
       sd.setBackground(Color.pink);
       bagi.setBackground(Color.pink);
       
       b1.setBounds(50, 50, 40, 40);
       b2.setBounds(100, 50, 40, 40);
       b3.setBounds(150, 50, 40, 40);
       tambah.setBounds(200, 50, 40, 40);
       
       b4.setBounds(50, 100, 40, 40);
       b5.setBounds(100, 100, 40, 40);
       b6.setBounds(150, 100, 40, 40);
       kurang.setBounds(200, 100, 40, 40);
       
       b7.setBounds(50, 150, 40, 40);
       b8.setBounds(100, 150, 40, 40);
       b9.setBounds(150, 150, 40, 40);
       kali.setBounds(200, 150, 40, 40);
       
       nol.setBounds(50, 200, 40, 40);
       c.setBounds(100, 200, 40, 40);
       sd.setBounds(150, 200, 40, 40);
       bagi.setBounds(200, 200, 40, 40);
       
       b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               text.setText("1");
           }
       });
       setVisible (true);
   }
   
   
   
    
    
    public static void main(String[] args) {
        Calculator cc=new Calculator();
        cc.objek();
    }
    
}
