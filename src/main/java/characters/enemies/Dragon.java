package characters.enemies;

import characters.Magician;
import characters.players.Creature;
import enums.Spell;

public class Dragon extends Magician {
    public Dragon(String name, int health, int strength, int intelligence, Spell spell, Creature creature){
        super(name, health, strength, intelligence, spell, creature);
    }
}
