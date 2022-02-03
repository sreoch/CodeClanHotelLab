import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getGuestsInRoom(){
        return this.guests.size();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }
}
