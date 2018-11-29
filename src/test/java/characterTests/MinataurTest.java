package characterTests;

import characters.enemies.Minataur;
import enums.Armour;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinataurTest {

    Minataur minataur;

    @Before
    public void before(){
        minataur = new Minataur("Cretan Bull", 10, 10, 3, Armour.LEATHER, Weapon.WARHAMMER);
    }

    @Test
    public void hasName(){
        assertEquals("Cretan Bull", minataur.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, minataur.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(10, minataur.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(3, minataur.getIntelligence());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.LEATHER, minataur.getArmour());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.WARHAMMER, minataur.getWeapon());
    }

    @Test
    public void canFightReturningDamageValue(){
        assertEquals(7, minataur.fightScore(4));
    }
}
