/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainswordsorcery;

/**
 *
 * @author Johnathan Flake
 * CS 383 - University of Idaho
 * 2/27/2014
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SolarDisplay extends JFrame implements ActionListener{
    /**
     * TODO: This is a javadoc for a field; how is taking arguments? Nothing 
     * in this whole class seems to have a parameter called "args". This javadoc
     * is the only instance of it in thefile
     * 
     * @param args the command line arguments
     */
    
        JLabel Title, SolarDay, RedSun, BlueSun;
        
        int SolarDayNum = 1;
        int RedSunVal = 1;
        int BlueSunVal = 7;
    
    public SolarDisplay() {
        
        setLayout(new GridLayout(5,1)); //5 rows, 1 column
        
        Title = new JLabel ("Solar Display", SwingConstants.CENTER);
        Title.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        SolarDay = new JLabel("Day: 1", SwingConstants.CENTER);
        SolarDay.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        RedSun = new JLabel("Red Sun State: Equilibrium", SwingConstants.CENTER);
        BlueSun = new JLabel("Blue Sun State: Equilibrium", SwingConstants.CENTER);
       
        //AddDay.setActionCommand("End Phase");
        //AddDay.addActionListener(this);
        
//        JLabel Blank = new JLabel ("");
        
        add(Title);
        add(SolarDay);
        add(RedSun);
        add(BlueSun);
        //add(AddDay);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 250, 150);
        setLocationRelativeTo(null);        
        setVisible(true);
}
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("EndPhase")){
            if (SolarDayNum < 27) {
            SolarDayNum++;
            }
            else {
                SolarDayNum = 1;
            }
            if (RedSunVal < 12){
                RedSunVal++;
            }
            else {
                RedSunVal = 1;
            }
            if (BlueSunVal < 12){
                BlueSunVal++;
            }
            else {
                BlueSunVal = 1;
            }
            SolarDay.setText("Day: " + SolarDayNum);
            
            switch (SolarDayNum){
                case 1: case 2: case 27:
                    if (RedSunVal > 2 && RedSunVal < 6){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 2 && BlueSunVal < 6){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                case 3: case 4:
                    if (RedSunVal > 3 && RedSunVal < 7){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 3 && BlueSunVal < 7){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 5: case 6:
                    if (RedSunVal > 4 && RedSunVal < 8){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 4 && BlueSunVal < 8){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 7: case 8: case 9:
                    if (RedSunVal > 5 && RedSunVal < 9){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 5 && BlueSunVal < 9){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 10: case 11:
                    if (RedSunVal > 6 && RedSunVal < 10){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 6 && BlueSunVal < 10){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 12: case 13:
                    if (RedSunVal > 7 && RedSunVal < 11){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 7 && BlueSunVal < 11){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 14: case 15:
                    if (RedSunVal > 8 && RedSunVal < 12){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 8 && BlueSunVal < 12){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 16: case 17:
                    if (RedSunVal > 9 && RedSunVal < 13){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 9 && BlueSunVal < 13){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 18: case 19: case 20:
                    if (RedSunVal == 11 || RedSunVal == 12 
                            || RedSunVal == 1){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal == 11 || BlueSunVal == 12 
                            || BlueSunVal == 1){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 21: case 22:
                    if (RedSunVal == 12 || RedSunVal == 1 
                            || RedSunVal == 2){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal == 12 || BlueSunVal == 1 
                            || BlueSunVal == 2){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 23: case 24:
                    if (RedSunVal > 0 && RedSunVal < 4){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 0 && BlueSunVal < 4){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
                    case 25: case 26:
                    if (RedSunVal > 1 && RedSunVal < 5){
                        RedSun.setText("Red Sun State: Ascension");
                        BlueSun.setText("Blue Sun State: Descension");
                    }
                    else if (BlueSunVal > 1 && BlueSunVal < 5){
                        RedSun.setText("Red Sun State: Descension");
                        BlueSun.setText("Blue Sun State: Ascension");
                    }
                    else{
                        RedSun.setText("Red Sun State: Equilibrium");
                        BlueSun.setText("Blue Sun State: Equilibrium");
                    }
                break;
            }
        }
    }
    
}