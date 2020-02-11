package level02.simulation;

import level02.bucketing.LargestNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    private static final LargestNumber largestNumber = new LargestNumber();

    @Test
    public void test1() {
        String largest = largestNumber.largestNumber(new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9)));
        assertEquals("9534330", largest);
    }


    @Test
    public void test2() {
        String largest = largestNumber.largestNumber(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)));
        assertEquals("0", largest);
    }
}
