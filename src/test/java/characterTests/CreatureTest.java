package characterTests;

import characters.players.Creature;
import enums.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Gollum", 10, 7, 9, CreatureType.MIDGIESWARM);
    }

    @Test
    public void hasName(){
        assertEquals("Gollum", creature.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, creature.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(7, creature.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(9, creature.getIntelligence());
    }

    @Test
    public void hasType(){
        assertEquals(CreatureType.MIDGIESWARM, creature.getCreatureType());
    }

    @Test
    public void canFightReturningDamageValue(){
        assertEquals(6, creature.fightScore(5));
    }
}
