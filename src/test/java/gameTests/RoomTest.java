package gameTests;

import characters.Character;
import characters.enemies.Dragon;
import characters.players.Creature;
import characters.players.Knight;
import enums.Armour;
import enums.CreatureType;
import enums.Spell;
import enums.Weapon;
import game.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    ArrayList<Character> goodguys;
    ArrayList<Character> badguys;
    Knight knight;
    Dragon dragon;
    Creature creature;

    @Before
    public void setup(){
        goodguys = new ArrayList<>();
        badguys = new ArrayList<>();
        creature = new Creature("Ellie", 10, 4, 5, CreatureType.MINION);
        knight = new Knight("bob", 10, 8, 6, Armour.RINGMAIL, Weapon.SWORD);
        dragon = new Dragon("jim", 10, 9, 4, Spell.FIREBALL, creature);
        goodguys.add(knight);
        badguys.add(dragon);
        room1 = new Room(goodguys, badguys, 10);
    }

    @Test
    public void hasGoodies(){
        assertEquals(1, room1.getGoodies().size());
    }

    @Test
    public void canAddMultipleGoodies(){
        goodguys.add(dragon);
        assertEquals(2, room1.getGoodies().size());
    }

    @Test
    public void hasBaddies(){
        assertEquals(1, room1.getBaddies().size());
    }

    @Test
    public void canAddMultipleBaddies(){
        badguys.add(knight);
        assertEquals(2, room1.getBaddies().size());
    }

    @Test
    public void hasTreasure(){
        assertEquals(10, room1.getTreasure());
    }


    @Test
    public void canPlayRoom(){
        goodguys.add(dragon);
        goodguys.add(knight);
        goodguys.add(knight);
        room1.playRoom();
    }
}
