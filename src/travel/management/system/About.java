/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author J Chaitanya Sai
 */
public class About extends JFrame implements ActionListener{
    JButton back;
    About(){
        setBounds(600,200,500,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel l1= new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        String s="About Project\n"
                + "                                                   \n"
                + "This Project is developing a Travel Management system GUI application using Java Swing\n"
                + "Advatages of this project: \n"
                + "->Allow users to register and login securely\n"
                
                + "->It provides an User Freindly atmosphere\n"
                + "->Gives Accurate information\n"
                + "->Allow users to book tour packages and Hotels\n"
                ;
        
        TextArea area= new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        setVisible(true);
        
        back = new JButton("back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
        
    }
    public static void main(String args[]){
        new About();
        
    }
    
}
