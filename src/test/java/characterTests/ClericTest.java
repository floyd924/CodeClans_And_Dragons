package characterTests;

import characters.players.Cleric;
import characters.players.Creature;
import characters.players.Warlock;
import enums.CreatureType;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Warlock warlock;
    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Gollum", 10, 7, 9, CreatureType.MIDGIESWARM);
        warlock = new Warlock("Bob", 2, 4, 8, Spell.FROG, creature);
        cleric = new Cleric("Budda", 10, 4, 9);
    }

    @Test
    public void hasName(){
        assertEquals("Budda", cleric.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, cleric.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(4, cleric.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(9, cleric.getIntelligence());
    }

    @Test
    public void canHeal(){
        cleric.heal(warlock);
        assertEquals(10, warlock.getHealth());
    }

}
