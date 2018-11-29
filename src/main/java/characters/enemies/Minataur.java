package characters.enemies;

import characters.Fighter;
import enums.Armour;
import enums.Weapon;

public class Minataur extends Fighter {

    public Minataur(String name, int health, int strength, int intelligence, Armour armour, Weapon weapon){
        super(name, health, strength, intelligence, armour, weapon);
    }
}
