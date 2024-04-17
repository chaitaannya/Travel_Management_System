
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author J Chaitanya Sai
 */
public class Bookpackage extends JFrame implements ActionListener{
    Choice cpackage;
    JTextField tfpersons;
    String username;
     JLabel labelusername,labelid,labeltotal,labelnumber,labelphone;
     JButton checkprice,bookpackage,back;
    Bookpackage(String username){
        this.username= username;
        setBounds(350,200,1100,500);
        setLayout(null);
        
        JLabel text = new JLabel("Book Package");
        text.setBounds(100,20,200,30);
        getContentPane().setBackground(Color.WHITE);

        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,15));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
 
         labelusername = new JLabel();
        labelusername.setBounds(250,70,200,20);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblpackage);
        
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,200,20);
        add(cpackage);
        
        
        
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblpersons);
        tfpersons = new JTextField();
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
       
        JLabel lblid = new JLabel("I'd");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblid);
        
         labelid = new JLabel();
        labelid.setBounds(250,190,200,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("I'd Number");
        lblnumber.setBounds(40,230,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblnumber);
        
         labelnumber= new JLabel();
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(40,270,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblphone);
        
         labelphone = new JLabel();
        labelphone.setBounds(250,270,200,25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40,310,150,25);
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lbltotal);
        
         labeltotal= new JLabel();
        labeltotal.setBounds(250,310,150,25);
        add(labeltotal);
        
        try{
            Conn conn= new Conn();
            String query="select * from customer where username = '"+username+"'    ";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                
                labelphone.setText(rs.getString("phone"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,380,150,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,380,150,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
         back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,380,150,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2= i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
       
        
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            String pack =cpackage.getSelectedItem();
            int cost=0;
            if(pack.equals("Gold Package")){
                cost+=32000;
                
            }else if(pack.equals("Silver Package")){
                cost+=24000;
            }else{
                cost+=12000;
            }
            int persons=Integer.parseInt(tfpersons.getText());
            cost*=persons;
            labeltotal.setText("Rs"+cost);
            
        }else if(ae.getSource()==bookpackage){
            
            
            try{
                Conn c= new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"' ,'"+labeltotal.getText()+"' ) ");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String args[]){
        new Bookpackage("cha");
    }
    
}
