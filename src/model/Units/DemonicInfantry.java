/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Units;
import Character.Character;

/**
 *
 * @author Matt
 */
public class DemonicInfantry extends Conjured{

    public DemonicInfantry(Character c, int lc) {
        super(c, lc);
        strength = 8;
        movement = 3;
        demoralizedStrength = 4;
        this.ResetWorkingMovement();
    }
        
}
