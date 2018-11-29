package characters.players;
import characters.Character;
import enums.CreatureType;


public class Creature extends Character {

    private CreatureType creatureType;

    public Creature(String name, int health, int strength, int intelligence, CreatureType creatureType){
        super(name, health, strength, intelligence);
        this.creatureType = creatureType;
    }

    public CreatureType getCreatureType() {
        return this.creatureType;
    }

    public int fightScore(int diceScore){
        return ((this.creatureType.getValue() * this.strength + (diceScore * 3))/13);
    }
}
