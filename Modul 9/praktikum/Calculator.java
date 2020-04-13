package praktikummodul9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
    
    JTextField text1 = new JTextField();
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt4 = new JButton("4");
    JButton bt5 = new JButton("5");
    JButton bt6 = new JButton("6");
    JButton bt7 = new JButton("7");
    JButton bt8 = new JButton("8");
    JButton bt9 = new JButton("9");
    JButton bt10 = new JButton("0");
    JButton bt11 = new JButton("+");
    JButton bt12 = new JButton("-");
    JButton bt13 = new JButton("*");
    JButton bt14 = new JButton("/");
    JButton bt15 = new JButton("C");
    JButton bt16 = new JButton("=");
    JButton bt17 = new JButton(">");
    JButton bt18 = new JButton("<");
    JButton bt19 = new JButton("%");
    JButton bt20 = new JButton("!=");
    
    Calculator() {
        setTitle("Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    double num = 0;
    double jwb;
    int itungan = 0;
    
    public void operasi() {
        switch (itungan) {
            case 1:
                jwb = num + Double.parseDouble(text1.getText());
                text1.setText(Double.toString(jwb));
                break;
            
            case 2:
                jwb = num - Double.parseDouble(text1.getText());
                text1.setText(Double.toString(jwb));
                break;
            case 3:
                jwb = num * Double.parseDouble(text1.getText());
                text1.setText(Double.toString(jwb));
                break;
            case 4:
                jwb = num / Double.parseDouble(text1.getText());
                text1.setText(Double.toString(jwb));
                break;
            case 5:
                jwb = num % Double.parseDouble(text1.getText());
                text1.setText(Double.toString(jwb));
                break;
            case 6:
                boolean jwbb = num > Double.parseDouble(text1.getText());
                text1.setText(String.valueOf(jwbb));
                break;
            case 7:
                boolean jwbbb = num < Double.parseDouble(text1.getText());
                text1.setText(String.valueOf(jwbbb));
                break;
            case 8:
                boolean jwbbbb = num != Double.parseDouble(text1.getText());
                text1.setText(String.valueOf(jwbbbb));
                break;
            
        }
    }
    
    void objek() {
        
        bt11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                num = Double.parseDouble(text1.getText());
                itungan = 1;
                text1.setText("");
            }
        });
        bt12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                num = Double.parseDouble(text1.getText());
                itungan = 2;
                text1.setText("");
            }
        });
        bt13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                num = Double.parseDouble(text1.getText());
                itungan = 3;
                text1.setText("");
            }
        });
        bt14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                num = Double.parseDouble(text1.getText());
                itungan = 4;
                text1.setText("");
            }
        });
        bt15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText("");
            }
        });
        bt16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                operasi();
            }
            
        });
        bt19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                num = Double.parseDouble(text1.getText());
                itungan = 5;
                text1.setText("");
            }
        });
        bt17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                num = Double.parseDouble(text1.getText());
                itungan = 6;
                text1.setText("");
            }
            
        });
        bt18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                num = Double.parseDouble(text1.getText());
                itungan = 7;
                text1.setText("");
            }
            
        });
        bt20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                num = Double.parseDouble(text1.getText());
                itungan = 8;
                text1.setText("");
            }
            
        });
        
        getContentPane().setLayout(null);
        getContentPane().add(text1);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);
        getContentPane().add(bt10);
        getContentPane().add(bt11);
        getContentPane().add(bt12);
        getContentPane().add(bt13);
        getContentPane().add(bt14);
        getContentPane().add(bt15);
        getContentPane().add(bt16);
        getContentPane().add(bt17);
        getContentPane().add(bt18);
        getContentPane().add(bt19);
        getContentPane().add(bt20);
        getContentPane().setBackground(Color.black);
        
        bt1.setBackground(Color.cyan);
        bt2.setBackground(Color.cyan);
        bt3.setBackground(Color.cyan);
        bt4.setBackground(Color.cyan);
        bt5.setBackground(Color.cyan);
        bt6.setBackground(Color.cyan);
        bt7.setBackground(Color.cyan);
        bt8.setBackground(Color.cyan);
        bt9.setBackground(Color.cyan);
        bt10.setBackground(Color.cyan);
        bt11.setBackground(Color.red);
        bt12.setBackground(Color.red);
        bt13.setBackground(Color.red);
        bt14.setBackground(Color.red);
        bt15.setBackground(Color.gray);
        bt16.setBackground(Color.GRAY);
        bt17.setBackground(Color.MAGENTA);
        bt18.setBackground(Color.magenta);
        bt19.setBackground(Color.magenta);
        bt20.setBackground(Color.magenta);
        
        text1.setBounds(50, 60, 290, 30);
        bt1.setBounds(50, 130, 50, 50);
        bt2.setBounds(130, 130, 50, 50);
        bt3.setBounds(210, 130, 50, 50);
        bt12.setBounds(290, 130, 50, 50);
        bt4.setBounds(50, 210, 50, 50);
        bt5.setBounds(130, 210, 50, 50);
        bt6.setBounds(210, 210, 50, 50);
        bt11.setBounds(290, 210, 50, 50);
        bt7.setBounds(50, 290, 50, 50);
        bt8.setBounds(130, 290, 50, 50);
        bt9.setBounds(210, 290, 50, 50);
        bt13.setBounds(290, 290, 50, 50);
        bt10.setBounds(50, 370, 50, 50);
        bt15.setBounds(130, 370, 50, 50);
        bt20.setBounds(210, 370, 50, 50);
        bt14.setBounds(290, 370, 50, 50);
        bt18.setBounds(50, 450, 50, 50);
        bt17.setBounds(130, 450, 50, 50);
        bt19.setBounds(210, 450, 50, 50);
        bt16.setBounds(290, 450, 50, 50);
        
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "1");
            }
        });
        
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "2");
                
            }
        });
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "3");
                
            }
        });
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "4");
                
            }
        });
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "5");
                
            }
        });
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "6");
                
            }
        });
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "7");
                
            }
        });
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "8");
                
            }
        });
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "9");
                
            }
        });
        bt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                text1.setText(text1.getText() + "0");
                
            }
        });
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Calculator cr = new Calculator();
        cr.objek();
        cr.operasi();
        
    }
    
}
