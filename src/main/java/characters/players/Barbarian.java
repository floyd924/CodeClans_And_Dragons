package characters.players;


import characters.Fighter;
import enums.Armour;
import enums.Weapon;

public class Barbarian extends Fighter {

    public Barbarian(String name, int health, int strength, int intelligence, Armour armour, Weapon weapon){
        super(name, health, strength, intelligence, armour, weapon);
    }
}
