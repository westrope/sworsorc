/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Spells.PL_6;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tao Zhang & Cameron Simon
 */
public final class Bind_Demon {
    JFrame frame;
    
    public Bind_Demon(){
        prepareGUI();
    }
    
    public void prepareGUI(){
        frame = new JFrame("Bind_Demon");
        frame.setSize(100,100);
        frame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing( WindowEvent e )
            {  //System.exit(0); 
                frame.dispose();
            }
        });
        
        JLabel notice = new JLabel("This is Bind_Demon");
        
        frame.add(notice);
        frame.setVisible(true);
    }   
    
    //check mana available
    public boolean checkMana(){
        boolean mana = false;
        
        //if( enough mana ){
          //  mana = true;
        //}
        //else{ print message that not enough mana};
        
        return mana;
    }
    
    //return spell range
    public int getRange(){
        int range = 15;
        // get spells range
        return range;
    }
    
    //get distance to selected unit
    public int getDistance(){
        int distance = 0;
        //get distance
        return distance;        
    }
    
    public void getTarget(){
        // this function is used to get the target to cast spell
    }
    
    public void performSpellEffects(){
        // this function is used to perform the spell effects
        // like cost mana, or the real effects described in rules
        if(checkMana() == true){
            // perform
            if(getDistance() <= getRange()){
                //peform spell
                /*
                    -Expend 4 manna points every Game-Turn ot retain control of the
                        Demon and must remain within 15 hexes of the Demon at all
                        times; if these conditions are not met the Demon is unbound.
                    -On the Game-Turn that a Character summons a Demon, he may 
                        attempt to bind the Demon.
                    -May also attempt to find another demon on the map that has
                        not been previously bound.
                    -Determine Magic Resistance.
                        int x = 1 + (int)(Math.random() * ((6 - 1) + 1));
                        if(x+2 >= Demons's magic resistance){
                            //spell succeeds
                        }
                        else{
                            //spell fails and demon remains unbound
                        }
                */        
            }
            else{
                //out of range
            }
            // what I am thinking about performing some data effects
            // is that we can make a tmp data file that stores all the
            // char or unit info, 
            // then we can just go into that file and change the data
            // then we read the file again for refresh the game data
            
            
        }else{
            // show warning that it desn't fit all the limitations
        }
        
        
        
    }
        
}