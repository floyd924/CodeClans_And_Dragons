package characterTests;

import characters.enemies.Dragon;
import characters.players.Creature;
import enums.CreatureType;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Creature creature;
    Spell spell;

    @Before
    public void before(){
        creature = new Creature("Mighty Midge", 4, 2, 9, CreatureType.MIDGIE);
        dragon = new Dragon("Fred", 10, 5, 7, Spell.ITCHYNOSE, creature);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", dragon.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, dragon.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(5, dragon.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(7, dragon.getIntelligence());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.ITCHYNOSE, dragon.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(creature, dragon.getCreature());
    }


    @Test
    public void canFightReturningDamageValue(){
        assertEquals(1, dragon.fightScore(1));
    }
}
