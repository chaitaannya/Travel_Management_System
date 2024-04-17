
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author J Chaitanya Sai
 */
public class loading extends JFrame implements Runnable {
    
    Thread t;
    JProgressBar progressbar;
   String username;
    @Override
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max= progressbar.getMaximum();
                int value= progressbar.getValue();
                if(value<max){
                    progressbar.setValue(progressbar.getValue() +1);
                }else{
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    loading(String username){
        this.username= username;
   
        t = new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text= new JLabel("Travel and Tourism Application");
        text.setBounds(15,20,600,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);

         progressbar= new JProgressBar();
        progressbar.setBounds(150,100,300,35);
        progressbar.setStringPainted(true);
        add(progressbar);
        
        JLabel laoding= new JLabel("Loading, please wait...");
        laoding.setBounds(230,130,190,30);
        laoding.setForeground(Color.RED);
        laoding.setFont(new Font("Raleway",Font.BOLD,16));
        add(laoding);
        
        JLabel lblusername= new JLabel("Wellcome "+username+" :)");
        lblusername.setBounds(20,310,400,40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblusername);
        
        t.start();
        setVisible(true);
        
        
    }
    
    public static void main(String args[]){
        new loading("");
    }

    
}
