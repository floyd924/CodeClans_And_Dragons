package game;

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


}
