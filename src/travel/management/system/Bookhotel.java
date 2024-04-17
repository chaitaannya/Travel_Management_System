
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author J Chaitanya Sai
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author J Chaitanya Sai
 */
public class Bookhotel extends JFrame implements ActionListener{
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
     JLabel labelusername,labelid,labeltotal,labelnumber,labelphone;
     JButton checkprice,bookhotel,back;
    Bookhotel(String username){
        this.username= username;
        setBounds(350,200,1100,600);
        setLayout(null);
        
        JLabel text = new JLabel("Book Hotel");
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
        
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblpackage);
        
        chotel = new Choice();
  
        chotel.setBounds(250,110,200,20);
        add(chotel);
        
        try{
            Conn c= new Conn();
            ResultSet rs= c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
                
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblpersons);
        tfpersons = new JTextField();
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        
        JLabel lbldays = new JLabel("No. of days");
        lbldays.setBounds(40,190,150,20);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lbldays);
        tfdays = new JTextField();
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
       
        JLabel lblac = new JLabel("AC/Non AC");
        lblac.setBounds(40,230,150,20);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblac);
        
        cac= new Choice();
        cac.add("AC");
        cac.add("Non AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included?");
        lblfood.setBounds(40,270,150,20);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblfood);
        
        cfood= new Choice();
        cfood.add("YES");
        cfood.add("NO");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        JLabel lblid = new JLabel("I'd");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblid);
        
         labelid = new JLabel();
        labelid.setBounds(250,310,200,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("I'd Number");
        lblnumber.setBounds(40,350,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblnumber);
        
         labelnumber= new JLabel();
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(40,390,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblphone);
        
         labelphone = new JLabel();
        labelphone.setBounds(250,390,200,25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40,430,150,25);
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lbltotal);
        
         labeltotal= new JLabel();
        labeltotal.setBounds(250,430,150,25);
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
        checkprice.setBounds(60,480,150,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(200,480,150,25);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
         back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,480,150,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2= i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(500,50,600,300);
        add(image);
       
        
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
            Conn c= new Conn();
            ResultSet rs= c.s.executeQuery("select * from hotel where name ='"+chotel.getSelectedItem()+"'");
            while(rs.next()){
                int cost=Integer.parseInt(rs.getString("costperperson"));
                int food=Integer.parseInt(rs.getString("foodincluded"));
                int ac=Integer.parseInt(rs.getString("acroom"));
                
                int persons= Integer.parseInt(tfpersons.getText());
                int days= Integer.parseInt(tfdays.getText());
                
                String acselected=cac.getSelectedItem();
                String foodselected=cfood.getSelectedItem();
                
                if(persons*days>0){
                    int totalprice  =0;
                    totalprice+=acselected.equals("AC")?ac:0;
                    totalprice+=foodselected.equals("YES")?food:0;
                    totalprice+=cost;
                    totalprice=totalprice*persons*days;
                    labeltotal.setText("Rs"+totalprice);
                }else{
                    JOptionPane.showMessageDialog(null,"Please enter a valid number");
                }

            }}
           
            catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==bookhotel){
            
            
            try{
                Conn c= new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"' ,'"+labeltotal.getText()+"' ) ");
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String args[]){
        new Bookhotel("chaitanya");
    }
    
}


