import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<ConferenceRoom> conferenceRooms, ArrayList<Bedroom> bedrooms, HashMap<String, DiningRoom> diningRooms) {
        this.conferenceRooms = conferenceRooms;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
    }


    public int getBedroomCount() {
        return bedrooms.size();
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        if (bedroom.getCapacity() > bedroom.getGuestsInRoom() ){
            bedroom.addGuest(guest);
        }

    }

    public void checkOut(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        return new Booking(bedroom, numberOfNights);
    }

    public ArrayList<Bedroom> returnVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms){
            if (bedroom.getGuestsInRoom() == 0){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }
}
