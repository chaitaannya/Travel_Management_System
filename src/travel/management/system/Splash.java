
package travel.management.system;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author J Chaitanya Sai
 */
public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
//        setSize(1200,600);
//        setLocation(150,200);
//        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        add(l);
        thread = new Thread(this);
        thread.start();
       
        setVisible(true);
    }
    public void run(){
        try{
          Thread.sleep(7000);
          setVisible(false);
        }
        catch(Exception e){
            
        }
}
    
    public static void main(String args[])
    {
        Splash frame = new Splash();
        int x=1;
        for(int i=1;i<=500;x+=7,i+=6){
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(50);
                
            } catch(Exception e ){
                
            }
        }
    }
}
