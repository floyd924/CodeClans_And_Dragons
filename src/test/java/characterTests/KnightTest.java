package characterTests;

import characters.players.Knight;
import enums.Armour;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sir Robin", 10, 2, 9, Armour.PLATEMAIL, Weapon.SPEAR);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Robin", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, knight.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(2, knight.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(9, knight.getIntelligence());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.PLATEMAIL, knight.getArmour());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SPEAR, knight.getWeapon());
    }

    @Test
    public void canFightReturningDamageValue(){
        assertEquals(2, knight.fightScore(2));
    }
}
