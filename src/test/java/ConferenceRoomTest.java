import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Room 1");
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Room 1", conferenceRoom.getName());
    }

    @Test
    public void hasEmptyRoom(){
        assertEquals(0, conferenceRoom.getGuestsInRoom());
    }
}
