package characters.players;


import characters.Magician;
import enums.Spell;

public class Wizard extends Magician {
    public Wizard(String name, int health, int strength, int intelligence, Spell spell, Creature creature){
        super(name, health, strength, intelligence, spell, creature);
    }

}
