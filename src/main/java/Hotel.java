import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
    private  ArrayList<Bedroom> bedrooms;

    public Hotel(ArrayList<ConferenceRoom> conferenceRooms, ArrayList<Bedroom> bedrooms) {
        this.conferenceRooms = conferenceRooms;
        this.bedrooms = bedrooms;
    }


    public int getBedroomCount() {
        return bedrooms.size();
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOut(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}
