package characters;

import enums.Armour;
import enums.Weapon;

public abstract class Fighter extends Character{

    protected Armour armour;
    protected Weapon weapon;

    public Fighter(String name, int health, int strength, int intelligence, Armour armour, Weapon weapon){
        super(name, health, strength, intelligence);
        this.armour = armour;
        this.weapon = weapon;
    }

    public int fightScore(int diceScore) {
        return ((this.weapon.getValue() * this.strength + (diceScore * 6))/13);
    }

    public Armour getArmour() {
        return this.armour;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
