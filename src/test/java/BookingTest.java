import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, RoomType.DOUBLE, 1, 10.00);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void canCalculateBill(){
        assertEquals(20.00, booking.calculateBill(), 0.0);
    }
}
