/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ssterrain;

/**
 *
 * @author John Goettsche
 * CS 383 Software Engineering
 */
import Units.*;
import sshexmap.MapHex;
public abstract class TerrainType {
    public abstract double getMovementCost(MoveableUnit unit);
    public abstract double getCombatMultiplier(MoveableUnit unit);
    public abstract String getCombatEffect(MoveableUnit unit);

    public static TerrainType makeTerrainType(String code) {
        switch(code) {
            case "Bl": return new TTBlasted();
            //case "Br": return new TTBridge();
            case "Bro": return new TTBroken();
            //case "Ci": return new TTCity();
            case "Cl": return new TTClear();
            case "Cu": return new TTCultivated();
            //case "D": return new TTDragonTunnel();
            case "Fore": return new TTForest();
            case "G": return new TTGlacier();
            case "K": return new TTKaroo();
            case "Mrl": return new TTWater();
            case "Mo": return new TTMountains();
            //case "Po": return new TTPortal();
            case "R": return new TTRough();
            //case "Sh": "Special Hex"; 
            case "Sw": return new TTSwamp();
            //case "V": return new TTVortex();
            case "Wo": return new TTWoods();
        }
        return null;
    }    
}
