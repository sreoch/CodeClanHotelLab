public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;
    private double nightlyRate;

    public Bedroom(int capacity, RoomType roomType, int roomNumber, double nightlyRate) {
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getValueFromEnum() {
        return this.roomType.getCapacity();
    }


    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
