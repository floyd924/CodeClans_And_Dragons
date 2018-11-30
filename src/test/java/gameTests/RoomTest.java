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

import java.util.ArrayList;

public class RoomTest {

    Room room1;
    ArrayList<Character> goodies;
    ArrayList<Character> baddies;
    Knight knight;
    Dragon dragon;
    Creature creature;

    @Before
    public void setup(){
        goodies = new ArrayList<>();
        baddies = new ArrayList<>();
        creature = new Creature("Ellie", 10, 4, 5, CreatureType.MINION);
        knight = new Knight("bob", 10, 8, 6, Armour.RINGMAIL, Weapon.SWORD);
        dragon = new Dragon("jim", 10, 9, 4, Spell.FIREBALL, creature);
        goodies.add(knight);
        baddies.add(dragon);
        room1 = new Room(goodies, baddies, 10);
    }
}
