import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2 ,RoomType.DOUBLE, 10);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        assertEquals(2, bedroom.getValueFromEnum());
    }

    @Test
    public void hasEmptyRoom(){
        assertEquals(0, bedroom.getGuestsInRoom());
    }
}
