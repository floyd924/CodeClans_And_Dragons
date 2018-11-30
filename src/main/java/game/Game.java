package game;

import characters.Character;

import java.util.ArrayList;

public class Game {

    public Game(){

    }


    public void generateRoom(ArrayList<Character> fellowship){
        int value = Dice.roll();
        ArrayList baddiesArray = new ArrayList<Character>();
        int treasure = 0;

        if (value == 1){
            baddiesArray.clear();
            treasure = 10;
        }
        if (value == 2){
            //add random enemy
            treasure = 10;
        }
        if (value == 3){
            //addRandmEnermy
            //addRandomEnemy
            //treature = 10
        }
        if (value == 4){
            //addRandmEnermy
            //addRandomEnemy
            //addRandomEnemy
            //treature = 10
        }
        if (value == 5){
            //addRandmEnermy
            //addRandomEnemy
            //addRandomEnemy
            //addRandomEnemy
            //treature = 10

        }
        if (value == 6){
            //addRandomEnemy
            //treaure = 20

        }
        Room room = new Room(fellowship, baddiesArray, treasure);
    }

    //addRandomEnemy
        //random number 1 or 2
        //if 1, call addRandomMinataur
        //if 2, call addRandomDragon

    //addRnadomMinataur
        //new Minataur(getrand1to10, etc etc)
        //add to baddies

    //addRandomDragon
        //new dragon (getRandom1to10, getRandom1to10, etc etc)
        //add to baddies

    //getRand1to10

    //getRandomArmour

    //getRandomWeapon

    //getRandomSpell

    //getRandomCreature
}
