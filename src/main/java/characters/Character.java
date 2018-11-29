package characters;

import behaviours.IFight;

public abstract class Character implements IFight {

    protected String name;
    protected int health;
    protected int strength;
    protected int intelligence;

    public Character(String name, int health, int strength, int intelligence){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
}
