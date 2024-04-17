/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author J Chaitanya Sai
 */
public class paytm extends JFrame implements ActionListener{
    JButton back ;
    paytm(){
        setBounds(500,200,800,600);
        JEditorPane pane= new JEditorPane();
        pane.setEditable(false);
        try{
            pane.setPage("https://paytm.com/rent-payment");
            
        
    }catch(Exception e){
        pane.setContentType("text/html");
        pane.setText("<html>Could not load, Error 404</html>");
                }
        
        JScrollPane sp= new JScrollPane(pane);
        getContentPane().add(sp);
        
         back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
        
    }
    public static void main(String args[]){
        new paytm();
    }
    
}
