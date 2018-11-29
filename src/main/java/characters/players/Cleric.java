package characters.players;

import characters.Character;
import behaviours.IFight;

public class Cleric  extends Character implements IFight {

    public Cleric(String name, int health, int strength, int intelligence){
        super(name, health, strength, intelligence);
    }

    public int fightScore(int diceScore) {
        return ((this.strength * diceScore)/10);
    }

    public void heal(Character character){
        character.setHealth(10);
    }
}
