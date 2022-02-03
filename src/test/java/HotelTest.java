import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRoom1;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, RoomType.DOUBLE, 1);
        bedroom2 = new Bedroom(1, RoomType.SINGLE, 2);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, "Room1");
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        hotel = new Hotel(conferenceRooms,bedrooms);
        guest1 = new Guest("Craig");
        guest2 = new Guest("Peter");
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.getBedroomCount());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest1, bedroom2);
        assertEquals(1, bedroom2.getGuestsInRoom() );
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(guest1, bedroom1);
        hotel.checkIn(guest2, bedroom1);
        hotel.checkOut(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestsInRoom());
    }
}
