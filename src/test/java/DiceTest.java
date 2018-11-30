import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceTest {

    @Ignore
    public void staticCanRoll(){
        assertEquals(6, Dice.roll());
    }

    //this method works, but it is a random number so the test only passes 12% of the time!!
}
