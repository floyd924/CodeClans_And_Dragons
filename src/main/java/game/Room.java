package game;

import characters.Character;
import characters.Fighter;
import characters.Magician;
import characters.enemies.Dragon;
import characters.enemies.Minataur;
import characters.players.Cleric;
import characters.players.Knight;
import characters.players.Wizard;

import java.util.ArrayList;

public class Room {

    private ArrayList<Character> goodies;
    private ArrayList<Character> baddies;
    private int treasure;

    public Room(ArrayList goodies, ArrayList baddies, int treasure){
        this.goodies = goodies;
        this.baddies = baddies;
        this.treasure = treasure;
    }

    public ArrayList<Character> getGoodies() {
        return this.goodies;
    }

    public ArrayList<Character> getBaddies() {
        return this.baddies;
    }

    public int getTreasure() {
        return this.treasure;
    }

    public int playRoom(){
        checkForFight();
        int goodiesPrize = 0;

        if (goodies.size() > 0){
            goodiesPrize = getTreaure();
        }
        else {
            everyoneIsDead();
        }

        return goodiesPrize;
    }

    public void checkForFight(){
        if (baddies.size() > 0){
            fight();
        }

    }

    public void fight(){
        int playerFightScore = 0;
        int baddieFightSCore = 0;

        playerFightScore = goodieHits();

        baddieFightSCore = baddieHits();

        takeHits(playerFightScore, baddieFightSCore);

        checkForFight();

    }

    public int goodieHits(){

        int goodieFightScore = 0;

        Character goodie1 = this.goodies.get(0);

        goodieFightScore = goodie1.fightScore(Dice.roll());

//        if (goodie1 instanceof Knight){
//            Knight knight1 = (Knight)p goodie1;
//            goodieFightScore = knight1.fightScore(Dice.roll());
//        }
//        if (goodie1 instanceof Magician){
//            Magician magician1 = (Magician) goodie1;
//            goodieFightScore = magician1.fightScore(Dice.roll());
//        }
//        else {
//            Cleric cleric1 = (Cleric) goodie1;
//            goodieFightScore = cleric1.fightScore(Dice.roll());
//        }

       return goodieFightScore;

    }

    public int baddieHits(){

        int baddieFightScore = 0;

        Character baddie1 = this.baddies.get(0);

        baddieFightScore = baddie1.fightScore(Dice.roll());

//        if (baddie1 instanceof Dragon){
//            Dragon dragon1 = (Dragon) baddie1;
//            baddieFightScore = dragon1.fightScore(Dice.roll());
//        }
//        if (baddie1 instanceof Minataur){
//            Minataur minataur1 = (Minataur) baddie1;
//            baddieFightScore = minataur1.fightScore(Dice.roll());
//        }

        return baddieFightScore;
    }

    public void takeHits(int a, int b){
        int goodieHealth = goodies.get(0).getHealth();
        int newGoodieHealth = goodieHealth - a;
        goodies.get(0).setHealth(newGoodieHealth);
        if (goodies.get(0).getHealth() < 1){
            goodies.remove(0);
        }


        int baddieHealth = baddies.get(0).getHealth();
        int newBaddieHealth = baddieHealth - b;
        baddies.get(0).setHealth(newBaddieHealth);
        if (baddies.get(0).getHealth() < 1){
            baddies.remove(0);
        }
    }

    public int getTreaure(){
        return this.treasure;
    }

    public String everyoneIsDead(){
        return "Nobody survived from either side";
    }




}
