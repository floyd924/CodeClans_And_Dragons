package characters.players;

import characters.players.Creature;
import characters.Magician;
import enums.Spell;

public class Warlock extends Magician {

    public Warlock(String name, int health, int strength, int intelligence, Spell spell, Creature creature){
        super(name, health, strength, intelligence, spell, creature);
    }
}
