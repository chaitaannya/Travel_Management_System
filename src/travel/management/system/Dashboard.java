
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author J Chaitanya Sai
 */
public class Dashboard extends JFrame implements ActionListener{
    JButton addpersonaldetails,viewpersonaldetails,updatepersonaldetails, checkpacakages,bookpackages,viewpackages,viewhotels,destinations,bookhotels,viewbookedhotel,deletepersonaldetails,payment,Calculator,Notepad,about;
    String username;
    Dashboard(String username){
        this.username= username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(0,0,1700,1000);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel icon= new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tohoma",Font.BOLD,30)); 
        p1.add(heading);
        
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
         addpersonaldetails = new JButton("Add Personal Details");
        addpersonaldetails.setBounds(0,0,300,50);
        addpersonaldetails.setBackground(new Color(0,0,102));
        addpersonaldetails.setForeground(Color.WHITE);
        addpersonaldetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        addpersonaldetails.setMargin(new Insets(0,0,0,30));
        addpersonaldetails.addActionListener(this);
        p2.add(addpersonaldetails);
        
         updatepersonaldetails = new JButton("Update Personal Details");
        updatepersonaldetails.setBounds(0,50,300,50);
        updatepersonaldetails.setBackground(new Color(0,0,102));
        updatepersonaldetails.setForeground(Color.WHITE);
        updatepersonaldetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        updatepersonaldetails.setMargin(new Insets(0,0,0,30));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);
        
         viewpersonaldetails = new JButton("View Details");
        viewpersonaldetails.setBounds(0,100,300,50);
        viewpersonaldetails.setBackground(new Color(0,0,102));
        viewpersonaldetails.setForeground(Color.WHITE);
        viewpersonaldetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewpersonaldetails.setMargin(new Insets(0,0,0,130));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);
        
         deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0,150,300,50);
        deletepersonaldetails.setBackground(new Color(0,0,102));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        deletepersonaldetails.setMargin(new Insets(0,0,0,40));
        deletepersonaldetails.addActionListener(this);
        p2.add(deletepersonaldetails);
        
         checkpacakages = new JButton("Check Packages");
        checkpacakages.setBounds(0,200,300,50);
        checkpacakages.setBackground(new Color(0,0,102));
        checkpacakages.setForeground(Color.WHITE);
        checkpacakages.setFont( new Font("Tahoma",Font.PLAIN,20));
        checkpacakages.setMargin(new Insets(0,0,0,110));
        checkpacakages.addActionListener(this);
        p2.add(checkpacakages);
        
         bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont( new Font("Tahoma",Font.PLAIN,20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
         viewpackages = new JButton("View Package");
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setMargin(new Insets(0,0,0,120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
         viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
         bookhotels = new JButton("Book Hotel");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont( new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,130));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
         viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,60));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
         destinations = new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont( new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,120));
        destinations.addActionListener(this);
        p2.add(destinations);
        
         payment = new JButton("Payments");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont( new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,150));
        payment.addActionListener(this);
        p2.add(payment);
        
         Calculator = new JButton("Calculator");
        Calculator.setBounds(0,600,300,50);
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont( new Font("Tahoma",Font.PLAIN,20));
        Calculator.setMargin(new Insets(0,0,0,145));
        Calculator.addActionListener(this);
        p2.add(Calculator);
        
         Notepad = new JButton("Notepad");
        Notepad.setBounds(0,650,300,50);
        Notepad.setBackground(new Color(0,0,102));
        Notepad.setForeground(Color.WHITE);
        Notepad.setFont( new Font("Tahoma",Font.PLAIN,20));
        Notepad.setMargin(new Insets(0,0,0,130));
        Notepad.addActionListener(this);
        p2.add(Notepad);
        
         about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont( new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,130));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text= new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addpersonaldetails){
            new Addcustomer(username);
            
        }else if(ae.getSource()==viewpersonaldetails)
        {
           new Viewdetails(username); 
        }
        else if(ae.getSource()==updatepersonaldetails){
            new Updatedetails(username);
        }
        else if(ae.getSource()==checkpacakages){
            new Checkpacakages();
        }
        else if(ae.getSource()==bookpackages){
            new Bookpackage(username);
        }
        else if(ae.getSource()==viewpackages){
            new Viewpackage(username);
        }
        else if(ae.getSource()==viewhotels)
        {
            new Checkhotels();
        }
        else if(ae.getSource()==destinations){
            new Destinations();
            
        }
        else if(ae.getSource()==bookhotels){
            new Bookhotel(username);
        }
        else if(ae.getSource()==viewbookedhotel){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()==payment){
            new Payments();
        }
        else if(ae.getSource()==Calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
            e.printStackTrace();
        }
        }
        else if(ae.getSource()==Notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()==about){
            new About();
        }
        else if(ae.getSource()==deletepersonaldetails){
            new Deletedetails(username);
        }
    }
    
    public static void main(String args[])
    {
        new Dashboard("");
    }
}
