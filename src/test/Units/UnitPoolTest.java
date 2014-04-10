/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Units;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import junit.framework.TestCase;

/**
 * In UnitPool.java you need to make the pool variable nonprivate in order to 
 * successfully run the junit tests.
 * 
 * 
 * @author David
 */
public class UnitPoolTest extends TestCase {
    
    public UnitPoolTest(String testName) {
        super(testName);
    }

    
    // test adding a unit to a null UnitPool.
    public void test01() {
        UnitPool pool = UnitPool.getInstance();
        pool.clear();
        pool.addUnit(1,new LightSword());
        boolean test = pool.pool.get(1).get("LightSword").isEmpty(); 
        assertFalse(test);
    }
    
    // testing multable additions.
    public void test02() {
        UnitPool pool = UnitPool.getInstance();
        pool.clear();
        
        
        pool.addUnit(1,new LightSword());
        boolean test = pool.pool.get(1).get("LightSword").isEmpty(); 
        assertFalse(test);
        
        pool.addUnit(1,new LightSword());
        
        System.out.println(Integer.toString(pool.pool.get(1).get("LightSword").size()));
        test = pool.pool.get(1).get("LightSword").size() == 2;
        assertTrue(test);
        
        pool.addUnit(1, new LightSpear());
        pool.addUnit(1,new LightSword());
        pool.addUnit(2, new LightSpear());
        pool.addUnit(2,new LightSword());
        
        test = pool.pool.size() == 2;
        assertTrue(test);
        
        test = pool.pool.get(1).get("LightSword").size() == 3;
        assertTrue(test);
        
        test = pool.pool.get(2).get("LightSpear").size() == 1;
        assertTrue(test);
        
    }
    
    //Tests update a unit position, test end of movement phase. 
    public void test03() {
        ArrayList<String> list1, list2, list3, list4;
        MoveableUnit unit;
        
        UnitPool pool = UnitPool.getInstance();
        pool.clear();
        assertTrue(pool != null);
        
        pool.addUnit(1,new LightSword(),"0101");
        
        
        
        list1 = pool.getUnitsInHex("0101");
        list2 = pool.getUnitHexMoves(list1.get(list1.size() - 1));
        unit = pool.getUnit(list1.get(0));// If null, it would've thrown a null pointer exception.
        assertTrue(1 == list1.size());
        assertTrue(1 == list2.size());
        
        pool.addMove(unit, "0102");
        pool.addMove(unit, "0103");
        
        list1 = pool.getUnitsInHex("0103");
        list2 = pool.getUnitHexMoves(list1.get(list1.size() - 1));
        assertTrue(1 == list1.size());
        assertTrue(3 == list2.size());
        
        pool.addUnit(2,new Bow(),"0101");
        list1 = pool.getUnitsInHex("0101");
        
        
        pool.addUnit(1,new Zeppelin(),"0102");
        list1 = pool.getUnitsInHex("0102");
        unit = pool.getUnit(list1.get(0));// If null, it would've thrown a null pointer exception.
        
        pool.addMove(unit, "0103");
        
        list1 = pool.getUnitsInHex("0103");
        list2 = pool.getUnitHexMoves(list1.get(0));
        list3 = pool.getUnitHexMoves(list1.get(1));
        
        //unit = pool.getUnit(list1.get(0));// If null, it would've thrown a null pointer exception.
        assertTrue(2 == list1.size());
        assertTrue(3 == list2.size());
        assertTrue(2 == list3.size());
        
        list1 = pool.getUnitsInHex("0101");
        list4 = pool.getUnitHexMoves(list1.get(0));
        
        pool.endMovementPhase();
        
        assertTrue(1 == list2.size());
        assertTrue(1 == list3.size());
        assertTrue(1 == list4.size());
        
    }
    
    //Tests undo move.
    public void test04(){
        ArrayList<String> list1, list2, list3, list4;
        MoveableUnit unit;
       
        
        UnitPool pool = UnitPool.getInstance();
        pool.clear();
        assertTrue(pool != null);
        
        pool.addUnit(1,new LightSword(),"0101");
        
        list1 = pool.getUnitsInHex("0101");
        list2 = pool.getUnitHexMoves(list1.get(list1.size() - 1));
        unit = pool.getUnit(list1.get(0));// If null, it would've thrown a null pointer exception.
        assertTrue(1 == list1.size());
        assertTrue(1 == list2.size());
        
        pool.addMove(unit, "0102");
        pool.addMove(unit, "0103");
        pool.addMove(unit, "0104");
        
        assertTrue(4 == list2.size());
        list1 = pool.getUnitsInHex("0104");
        pool.undoMove(list1.get(0));
        list2 = list2 = pool.getUnitHexMoves(list1.get(list1.size() - 1));
        
        assertTrue(3 == list2.size());
        
    }
    
    public void test05(){
        Random rNum = new Random();
        int a,b,b0=0,b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0; 
        UnitPool pool = UnitPool.getInstance();
        pool.clear();
        
        for ( int i = 0; i < 1000; i++){
            a = rNum.nextInt(10);
            b = rNum.nextInt(7);
            switch(b){
                
                case 0: 
                    b0++;
                    break;
                case 1: 
                    b1++;
                    break;
                case 2: 
                    b2++;
                    break;
                case 3: 
                    b3++;
                    break;
                case 4:
                    b4++;
                    break;
                case 5:
                    b5++;
                    break;
                case 6:
                    b6++;
                    break;
            }
            
            
            switch(a){
                case 0: 
                    pool.addUnit(b, new LightSword(),"0101");
                    break;
            }
        }
        
        
    }
}
