package game;

import characters.Character;
import characters.enemies.Dragon;
import characters.enemies.Minataur;
import characters.players.Creature;
import enums.Armour;
import enums.CreatureType;
import enums.Spell;
import enums.Weapon;

import java.util.ArrayList;

public class Game {

    public Game() {

    }
    //somewhere create an arraylist of goodies?


    //next, we need a room.play method, which lets us fight, and if we win we get treasure and a message


//    public void play(){
//        Room newRoom = this.generateRoom(){};
//        newRoom.playRoom();
//    }


    public Room generateRoom(ArrayList<Character> fellowship) {
        int value = Dice.roll();
        ArrayList baddiesArray = new ArrayList<Character>();
        int treasure = 0;

        if (value == 1) {
            baddiesArray.clear();
            treasure = 10;
        }
        if (value == 2) {
            baddiesArray.add(getRandomEnemy());
            treasure = 10;
        }
        if (value == 3) {
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            treasure = 10;
        }
        if (value == 4) {
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            treasure = 10;
        }
        if (value == 5) {
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            baddiesArray.add(getRandomEnemy());
            treasure = 10;
        }
        if (value == 6) {
            baddiesArray.add(getRandomEnemy());
            treasure = 20;

        }
        Room room = new Room(fellowship, baddiesArray, treasure);
        return room;
    }


    public Character getRandomEnemy(){
        int number = (int)(Math.random() * 2 + 1);
        if (number == 1) {
            return getRandomDragon();
        }
        else return getRandomMinataur();
    }


    public Minataur getRandomMinataur(){
        Minataur minataur = new Minataur("minataur", getRand1to10(), getRand1to10(), getRand1to10(), getRandomArmour(), getRandomWeapon());
        return minataur;
    }


    public Dragon getRandomDragon() {
        Dragon dragon = new Dragon("dragon", this.getRand1to10(), this.getRand1to10(), this.getRand1to10(), this.getRandomSpell(), this.getRandomCreature());
        return dragon;
    }

    public int getRand1to10(){
      return (int)(Math.random() * 10 + 1);
    }

    public Armour getRandomArmour(){
        return Armour.getRandom();
    }

    public Weapon getRandomWeapon(){
        return Weapon.getRandom();
    }

    public Spell getRandomSpell(){
        return Spell.getRandom();
    }

    public Creature getRandomCreature(){
        Creature creature = new Creature("creature", this.getRand1to10(), this.getRand1to10(), this.getRand1to10(), this.getRandomCreatureType());
        return creature;
    }

    public CreatureType getRandomCreatureType(){
      return CreatureType.getRandom();
    }


}
