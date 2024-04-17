/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
/**
 *
 * @author J Chaitanya Sai
 */
public class Login extends JFrame implements ActionListener {
    JTextField tfpassword, tfusername;
    JButton password,login,signup;
    Login(){
        
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new   JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN SERIE",Font.PLAIN,20));
        p2.add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        p2.add(tfusername);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        
         JLabel lalpassword = new   JLabel("Password");
        lalpassword.setBounds(60,110,100,30);
        lalpassword.setFont(new Font("SAN SERIE",Font.PLAIN,20));
        p2.add(lalpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        p2.add(tfpassword);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        
         login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        p2.add(login);
        
           
        signup = new JButton("Sign Up");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        signup.addActionListener(this);
        p2.add(signup);
        
         password = new JButton("Forgot Password");
        password.setBounds(130,250,130,30);
        password.setBackground(new Color(133,193,233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133,193,233)));
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.RED);
        p2.add(text);
        
        
         
        setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login)
        {
          try{
              String username = tfusername.getText();
              String pass= tfpassword.getText();
              
              String query="select * from account where username = '"+username+"' AND password = '"+pass+"'   ";
              Conn c= new Conn();
              ResultSet rs=c.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                 new loading(username);
                  
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect username or password");
              }
              
              
          }  
          catch(Exception e){
              e.printStackTrace();
          }
        }else if(ae.getSource()== signup){
            setVisible(false);
            new Signup();
            
        }else{
            setVisible(false);
            new Forgetpassword();
        }
        
    }
    public static void main(String args[])
    {
        new Login();
    }
}
