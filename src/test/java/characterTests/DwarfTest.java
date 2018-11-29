package characterTests;

import characters.players.Dwarf;
import enums.Armour;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Thorin", 10, 9, 5, Armour.CHAINMAIL, Weapon.BATTLEAXE);
    }

    @Test
    public void hasName(){
        assertEquals("Thorin", dwarf.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, dwarf.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(9, dwarf.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(5, dwarf.getIntelligence());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.CHAINMAIL, dwarf.getArmour());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.BATTLEAXE, dwarf.getWeapon());
    }

    @Test
    public void canFightReturningDamageValue(){
        assertEquals(6, dwarf.fightScore(3));
    }
}
