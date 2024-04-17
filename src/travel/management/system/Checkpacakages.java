/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.awt.*;

import javax.swing.*;

/**
 *
 * @author J Chaitanya Sai
 */
public class Checkpacakages extends JFrame{
    
    Checkpacakages(){
        String [] pacakage1={"GOLD Package","6 Days and 7 nights","Airport Assistance","Full City tour","Daily Buffet","Full day 3 Island cruise","English Speaking guide","BOOK NOW","32000/-","package1.jpg"};
        String [] pacakage2={"SILVER Package","5 days and 6 nights","Free Entrance Tickets","Meet and Greet at Airport"," Paragliding everyday","Night safari","Free Horse Riding","BOOK NOW", "24000/-","package2.jpg"};
        String [] pacakage3={"BRONZE Package","4 days and 5 nights","Free airfare","Free Clubing","Welcome drinks ","Daily buffet for lunch","Rainwater dance","BOOK NOW","12000/-","package3.jpg"};
        setBounds(450,200,900,600);
        

        JTabbedPane tab= new JTabbedPane();
       
        JPanel p1=createPackage(pacakage1);
        tab.addTab("Package 1", p1);
        JPanel p2=createPackage(pacakage2);
        tab.addTab("Package 2", p2);
        JPanel p3=createPackage(pacakage3);
        tab.addTab("Package 3", p3);
        add(tab);
        
        
        setVisible(true);
        
    }
    public JPanel createPackage(String [] pack){
        
         JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setForeground(Color.WHITE);
        
        JLabel l1= new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l2= new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);
        
        JLabel l3= new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        JLabel l4= new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);
        
        JLabel l5= new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6= new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);
        
        JLabel l7= new JLabel(pack[6]);
        l7.setBounds(30,320,300,30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l7);
        
        
        
        JLabel l8= new JLabel(pack[7]);
        l8.setBounds(60,450,300,30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l8);
        
        
        JLabel l9= new JLabel(pack[8]);
        l9.setBounds(500,450,300,30);
        l9.setForeground(Color.CYAN);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/"+ pack[9]));
        Image i2= i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350,20,500,300);
        p1.add(image);
        
        return p1;
    }
    public static void main(String args[]){
        new Checkpacakages();
    }
    
}
