package TP;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TP3_D extends JFrame implements ActionListener{
private DecimalFormat duaAngka;


    Label label1 = new Label("Masukkan Angka Pertama");
    Label label2 = new Label("Masukkan Angka Kedua");
    Label label3 = new Label("Hasil");
    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    Button bt1 = new Button("+");
    Button bt2 = new Button("-");
    Button bt3 = new Button("/");
    Button bt4 = new Button("*");  

    public static void main(String[] args) {

        /**
         * Pemanggilan class
         */
        TP3_D gui = new TP3_D();
        gui.objek();
        gui.setVisible(true);
    }
TP3_D() {
        /**
         * set config for Jframe
         */
        setTitle("Pendahuluan 3");
        setLocation(550, 200);
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void objek() {
        getContentPane().setLayout(null);
        /**
         * Menambahkkan komponen kedalam jframe
         */
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(text1);
        getContentPane().add(text2);
        getContentPane().add(text3);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        
        
        
        
        duaAngka = new DecimalFormat("0.00");
        
        /**
         * Block code untuk mengatur posisi label, text input dan button
         */
        label1.setBounds(25, 10, 200, 10);
        text1.setBounds(25, 30, 200, 20);
        label2.setBounds(25, 70, 200, 10);
        text2.setBounds(25, 90, 200, 20);
        label3.setBounds(25, 130, 200, 10);
        text3.setBounds(25, 150, 200, 20);
        bt1.setBounds(25, 180, 50, 50);
        bt2.setBounds(100, 180, 50, 50);
        bt3.setBounds(175, 180, 50, 50);
        bt4.setBounds(100, 230, 50, 50);
                
        
        bt1.addActionListener(this);
        bt2.addActionListener( this);
        bt3.addActionListener( this);
        bt4.addActionListener( this);
       
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        double nilai1=Double.parseDouble(text1.getText());
        double nilai2=Double.parseDouble(text2.getText());
        
        if (e.getSource() == bt4) {
         text3.setText("" + duaAngka.format(nilai1 * nilai2));
      }else if(e.getSource()==bt1){
        text3.setText("" + duaAngka.format(nilai1+nilai2));
    }else if(e.getSource()==bt2){
        text3.setText("" + duaAngka.format(nilai1-nilai2));
    }else if(e.getSource()==bt3){
        text3.setText("" + duaAngka.format(nilai1/nilai2));
    }
// 
//      else if (e.getSource() == buttonTambah) {
//         textHasil.setText("" + duaAngka.format(nilai1 + nilai2));
//      }
    }
}
