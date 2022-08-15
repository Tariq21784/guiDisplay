/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guidisplay;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
/**
 *
 * @author arnol
 */
public class GuiDisplay implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame firstApp = new JFrame();
        
        JLabel textBoxLabel = new JLabel();
        
    public void windowSetup(){
        textBoxLabel.setFont(new Font("Verdana", Font.PLAIN,15));
        textBoxLabel.setText("Name: ");
        textBoxLabel.setBounds(0, 20, 50, 10);
        JTextField nameField = new JTextField(""); 
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setPreferredSize(new Dimension(150, 30));
        firstApp.add(textBoxLabel);
 

        JButton button = new JButton("SUBMIT");
        firstApp.setSize(300, 400);
        firstApp.setLayout(new FlowLayout());
        firstApp.add(button);
        firstApp.add(nameField);  
        firstApp.setVisible(true);
        
        firstApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
};
//        button.setPreferredSize(new Dimension(150, 30));
           
//        @Override
        button.ActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent e){ 
            JDialog messageDisplay = new JDialog(firstApp,"Welcome", true);
            messageDisplay.setVisible(true);
            }
        }
        
       
    

