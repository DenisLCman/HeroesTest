package Server.GameEngine.Entity.Tests;

import Server.GameEngine.Entity.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void getOwner() {
        Army army = new Army("firstPlayer");
        String expected = army.getOwner();
        String actual = "firstPlayer";
        Assert.assertEquals(expected, actual);
    }
    @Test
    void addUnit() {
        Position pos = new Position(1,1);
        Unit unit = new Knight();
        Army army1 = new Army("firstPlayer");
        army1.addUnit(pos, unit);
        Army army2 = new Army("secondPlayer");
        army2.map.put(pos, unit);
        Unit expected = army1.map.get(pos);
        Unit actual = army2.map.get(pos);

        Assert.assertEquals(expected, actual);
    }
    @Test
    void getUnit() {
        Army army = new Army("firstPlayer");
        army.addUnit(new Position(1,1),new Knight());
        Unit expected = army.getUnit(new Position(1,1));
        Unit actual = army.map.get(new Position(1,1));
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getUnits() {
        Army expected = new Army("first");
        expected.addUnit(new Position(1,1), new Mage());
        expected.addUnit(new Position(2,2), new Mage());
        expected.addUnit(new Position(2,1), new Mage());
        HashMap<Position, Unit> actual = expected.map;
        Assert.assertEquals(expected.getUnits(), actual);
    }

    @Test
    void killUnit() {
        Position pos = new Position(1,1);
        Army expected = new Army("first");
        expected.addUnit(pos, new Mage());
        expected.killUnit(pos);
        assertNull(expected.map.get(pos));
    }

    @Test
    void isAliveGeneralTestLive() {
        Army army = new Army("first");
        Position pos1 = new Position(1,1);
        Position pos2 = new Position(2,2);
        army.addUnit(pos1,new Knight());
        army.getUnit(pos1).setGeneral(true);
        army.addUnit(pos2,new Mage());
        Assert.assertEquals(true, army.isAliveGeneral());
    }
    @Test
    void isAliveGeneralTestBuff() {
        Army army = new Army("first");
        Position pos1 = new Position(1,1);
        Position pos2 = new Position(2,2);
        army.addUnit(pos1,new Knight());
        army.getUnit(pos1).setGeneral(true);
        army.addUnit(pos2,new Mage());
        army.isAliveGeneral();
        Assert.assertEquals(army.getUnit(pos2).getArmor(), 15);
    }
    @Test
    void isAliveGeneralTestDebuff() {
        Army army = new Army("first");
        Position pos1 = new Position(1,1);
        Position pos2 = new Position(2,2);
        army.addUnit(pos1,new Knight());
        army.getUnit(pos1).setGeneral(true);
        army.addUnit(pos2,new Mage());
        army.killUnit(pos1);
        army.isAliveGeneral();
        Assert.assertEquals(false, army.isAliveGeneral());
    }


    @Test
    void isAliveGeneralTestNoLive() {
        Army army = new Army("first");
        Position pos1 = new Position(1,1);
        Position pos2 = new Position(2,2);
        army.addUnit(pos1,new Knight());
        army.addUnit(pos2,new Mage());
        Assert.assertNotEquals(true, army.isAliveGeneral());
    }
}