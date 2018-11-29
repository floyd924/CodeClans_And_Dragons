package characterTests;

import characters.players.Creature;
import characters.players.Wizard;
import enums.CreatureType;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Creature creature;
    Spell spell;

    @Before
    public void before(){
        creature = new Creature("Mighty Midge", 4, 2, 9, CreatureType.MIDGIE);
        wizard = new Wizard("Fred", 10, 5, 7, Spell.ITCHYNOSE, creature);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", wizard.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, wizard.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(5, wizard.getStrength());
    }

    @Test
    public void hasIntelligence(){
        assertEquals(7, wizard.getIntelligence());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.ITCHYNOSE, wizard.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(creature, wizard.getCreature());
    }


    @Test
    public void canFightReturningDamageValue(){
        assertEquals(1, wizard.fightScore(1));
    }
}
