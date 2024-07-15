package Server.GameEngine.Entity.Tests;

import Server.GameEngine.Entity.Archer;
import Server.GameEngine.Entity.Healer;
import Server.GameEngine.Entity.Knight;
import Server.GameEngine.Entity.Mage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @org.junit.jupiter.api.Test
    void getTypeKnight() {
        Knight unit = new Knight();
        String expected = unit.getType();
        String actual = "Knight";
        Assert.assertEquals(expected, actual);
    }
    @Test
    void getTypeMage() {
        Mage unit = new Mage();
        String expected = unit.getType();
        String actual = "Mage";
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getMaxHPArcher() {
        Archer unit = new Archer();
        int expected = unit.getMaxHP();
        int actual = 10;
        Assert.assertEquals(expected, actual);
    }
    @Test
    void getMaxHPHealer() {
        Healer unit = new Healer();
        int expected = unit.getMaxHP();
        int actual = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getNowHPKnight() {
        Knight unit = new Knight();
        int expected = unit.getNowHP();
        int actual = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getDamageMage() {
        Mage unit = new Mage();
        int expected = unit.getDamage();
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAccuracyArcher() {
        Archer unit = new Archer();
        int expected = unit.getAccuracy();
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getArmorHealer() {
        Healer unit = new Healer();
        int expected = unit.getArmor();
        int actual = 12;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void isAlive() {
        Healer unit = new Healer();
        boolean expected = unit.isAlive();
        boolean actual = true;
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void isGeneral(){
        Healer unit = new Healer();
        boolean expected = unit.isGeneral();
        boolean actual = false;
        Assert.assertEquals(expected, actual);
    }

}