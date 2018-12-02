package game;

import characters.Character;
import characters.Fighter;
import characters.players.Cleric;
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

    public void playRoom(){
        checkForFight();

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

        if (goodie1 instanceof Fighter){
            Fighter fighter1 = (Fighter) goodie1;
            goodieFightScore = fighter1.fightScore(Dice.roll());
        }
        if (goodie1 instanceof Wizard){
            Wizard wizard1 = (Wizard) goodie1;
            goodieFightScore = wizard1.fightScore(Dice.roll());
        }
        else {
            Cleric cleric1 = (Cleric) goodie1;
            goodieFightScore = cleric1.fightScore(Dice.roll());
        }

       return goodieFightScore;

    }

    public int baddieHits(){

        int baddieFightScore = 0;

        Character baddie1 = this.baddies.get(0);

        if (baddie1 instanceof Fighter){
            Fighter fighter1 = (Fighter) baddie1;
            baddieFightScore = fighter1.fightScore(Dice.roll());
        }
        if (baddie1 instanceof Wizard){
            Wizard wizard1 = (Wizard) baddie1;
            baddieFightScore = wizard1.fightScore(Dice.roll());
        }

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




}
