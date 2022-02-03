import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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
    private Booking booking1;
    private DiningRoom diningRoom1;
    private DiningRoom diningRoom2;
    private HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, RoomType.DOUBLE, 1, 10.00);
        bedroom2 = new Bedroom(1, RoomType.SINGLE, 2, 5.00);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, "Room1");
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        guest1 = new Guest("Craig");
        guest2 = new Guest("Peter");
        diningRoom1 = new DiningRoom(50, "CodeClan Cafe");
        diningRoom2 = new DiningRoom(100, "Dining Room 2");
        diningRooms = new HashMap<String, DiningRoom>();
        diningRooms.put(diningRoom1.getName(), diningRoom1);
        diningRooms.put(diningRoom2.getName(), diningRoom2);
        hotel = new Hotel(conferenceRooms, bedrooms, diningRooms);
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

    @Test
    public void canBookRoom(){
        booking1 = hotel.bookRoom(bedroom1, 2);
        assertEquals(bedroom1, booking1.getBedroom());
        assertEquals(2, booking1.getNumberOfNights());
    }


}
