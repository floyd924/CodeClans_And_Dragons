package gameTests;

import enums.Armour;
import enums.CreatureType;
import enums.Spell;
import enums.Weapon;
import game.Game;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game1;

    @Before
    public void setup(){
        game1 = new Game();
    }

    @Ignore
    public void canGetARandomCreatureType(){
        assertEquals(CreatureType.GOBLIN, game1.getRandomCreatureType());
    }

    @Ignore
    public void canGetRandomCreature(){
        assertEquals(CreatureType.GOBLIN, game1.getRandomCreature().getCreatureType());
    }

    @Ignore
    public void canGetRandomSpell(){
        assertEquals(Spell.FROG, game1.getRandomSpell());
    }

    @Ignore
    public void canGetRandomWeapon(){
        assertEquals(Weapon.SWORD, game1.getRandomWeapon());
    }

    @Ignore
    public void canGetRandomArmour(){
        assertEquals(Armour.CHAINMAIL, game1.getRandomArmour());
    }

    @Ignore
    public void canGetRandomNumber(){
        assertEquals(1, game1.getRand1to10());
    }

    @Ignore
    public void canGetRandomDragon(){
        assertEquals(Spell.FROG, game1.getRandomDragon().getSpell());
    }

    @Ignore
    public void canGetRandomMinataur(){
        assertEquals(Weapon.SWORD, game1.getRandomMinataur().getWeapon());
    }

    @Ignore
    public void canGetRandomEnemy(){
        assertEquals("dragon", game1.getRandomEnemy().getName());
    }

}
