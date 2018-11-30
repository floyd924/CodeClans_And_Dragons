package gameTests;

import characters.Character;
import game.Room;
import org.junit.Before;

import java.util.ArrayList;

public class RoomTest {

    Room room1;
    ArrayList<Character> goodies;
    ArrayList<Character> baddies;

    @Before
    public void setup(){
        goodies = new ArrayList<>();
        baddies = new ArrayList<>();
        //create some people
        // add the people
        room1 = new Room(goodies, baddies, 10);
    }
}
