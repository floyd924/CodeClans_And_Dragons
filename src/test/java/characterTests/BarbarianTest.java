package characterTests;

import characters.players.Barbarian;
import enums.Armour;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Konan", 10, 8, 2, Armour.PLATEMAIL, Weapon.SWORD);
    }

    @Test
    public void hasName(){
        assertEquals("Konan", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, barbarian.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(8, barbarian.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(2, barbarian.getIntelligence());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.PLATEMAIL, barbarian.getArmour());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

    @Test
    public void canFightReturningDamageValue(){
        assertEquals(6, barbarian.fightScore(6));
    }
}
