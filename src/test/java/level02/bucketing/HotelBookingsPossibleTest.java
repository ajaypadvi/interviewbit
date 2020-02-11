package level02.bucketing;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelBookingsPossibleTest {

    private static final HotelBookingsPossible bookings = new HotelBookingsPossible();

    @Test
    public void test1() {
        ArrayList<Integer> arrivals = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> departures = new ArrayList<>(Arrays.asList(2, 6, 8));
        boolean isBookingPossible = bookings.hotel(arrivals, departures, 1);
        assertFalse(isBookingPossible);
    }

    @Test
    public void test2() {
        ArrayList<Integer> arrivals = new ArrayList<>(Arrays.asList(9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27));
        ArrayList<Integer> departures = new ArrayList<>(Arrays.asList(32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38));
        boolean isBookingPossible = bookings.hotel(arrivals, departures, 16);
        assertTrue(isBookingPossible);
    }
}
