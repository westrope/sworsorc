/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Spells.PL_2;

import Character.Characters;
import mainswordsorcery.HUDController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javafx.scene.image.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sshexmap.HexMap;

/**
 *
 * @author Tao Zhang
 */
public final class Morale {
    int MoraleRange = 7;
    int MoraleMannaCost = 3;
    
    JFrame frame;
    
    Characters character;
    
    HUDController hud = new HUDController();
    
    String target_name;
    String target_hex;
    
    public Morale(Characters c){
        character = c;
        
        getTarget();
        
    }
    
    public void prepareGUI(){
        frame = new JFrame("Morale");
        frame.setSize(600,500);
        frame.setLayout(new BorderLayout());
        frame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing( WindowEvent e )
            {  
                
            }
        });
        
        JLabel notice = new JLabel("You succeed to cast Morale");
        JButton ok_button = new JButton("Great");
        ok_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        JButton again_button = new JButton("Cast again");
        again_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        JPanel selection = new JPanel();
        selection.setLayout(new FlowLayout());
        selection.add(ok_button);
        selection.add(again_button);
        
        ImageIcon morale_image = new ImageIcon("resources/images/Spells/Morale.jpg");
        java.awt.Image img = morale_image.getImage();
        JPanel image_panel = new JPanel();
        //image_panel.setLayout(new BorderLayout());
        JLabel image_lable = new JLabel("",morale_image, JLabel.CENTER);
        
        image_panel.add(image_lable);
        frame.add(image_panel, BorderLayout.CENTER);
        frame.add(selection, BorderLayout.SOUTH);
        frame.add(notice, BorderLayout.NORTH);
        frame.setVisible(true);
    }   
    
    public void getTarget(){
        //hud.setupEventHandlers();
        target_hex = "1000";//hud.target_unit.location;
        // this function is used to get the target to cast spell
        
        // set the target hex 
        /*
        final JFrame target_info = new JFrame("Target Info");
        target_info.setSize(300,200);
        
        target_info.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { 
                System.exit(0);
            }

        });
        
        target_info.setLayout(null);
        target_info.setLocation(10,50);
        
        JLabel target_name = new JLabel("Target name: ");
        target_name.setBounds(10, 20, 150, 20);
        target_info.add(target_name);
        // Textfield character name
        final JTextField target_name_field = new JTextField();
        target_name_field.setBounds(200, 20, 100, 20);
        target_info.add(target_name_field);
        
        // Hex info
        JLabel target_hex = new JLabel("Target Hex number:");
        target_hex.setBounds(10,60,150,20);
        target_info.add(target_hex);
        // Textfield character hex
        final JTextField target_hex_field = new JTextField();
        target_hex_field.setBounds(200, 60, 100, 20);
        target_info.add(target_hex_field);
        
        JButton get_t = new JButton("Get");
        get_t.setBounds(150, 100, 50, 20);
        target_info.add(get_t);
        
        get_t.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                target_n = target_name_field.getText();
                
                target_h = target_hex_field.getText();
                
                target_info.dispose();
                
                performSpellEffects();
            }
        });
        
        target_info.setVisible(true);
                */
    }
    
    public boolean checkLimits(){
        boolean limit = true;
        
        limit = checkRange();
        //if( fit all the limits ){
          //  limit = true;
        //}
        
        return limit; 
    }
    
    public boolean checkRange(){
        boolean go = true;
        int distance = HexMap.distance(character.location, target_hex);
        if(distance > MoraleRange){
            go = false;
        }
        return go; 
    }
    
    public void performSpellEffects(){
        // this function is used to perform the spell effects
        // like cost mana, or the real effects described in rules
        if(checkLimits() == true){
            // perform
            
            // what I am thinking about performing some data effects
            // is that we can make a tmp data file that stores all the
            // char or unit info, 
            // then we can just go into that file and change the data
            // then we read the file again for refresh the game data
            prepareGUI();
            
        }else{
            // show warning that it desn't fit all the limitations
            System.out.println("Limits not fit");
            System.exit(0);
        }
        
        
        
    }
    
    public boolean successCast(){
        return true;
    }
    
    public void CostManna(){
        if(successCast()){
            character.CostManna(3);
        }else{
            // do nothing
        }
    }
    
}
