package characters;

import characters.players.Creature;
import enums.Spell;

public abstract class Magician extends Character {

    private Spell spell;
    private Creature creature;

    public Magician(String name, int health, int strength, int intelligence, Spell spell, Creature creature){
        super(name, health, strength, intelligence);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Creature getCreature() {
        return this.creature;
    }

    public int fightScore(int diceScore){
        return ((this.spell.getValue() * this.intelligence + (diceScore * 6))/13);
    }


}
