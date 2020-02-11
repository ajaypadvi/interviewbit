package level02.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAndMissingNumberTest {

    private static final RepeatAndMissingNumber repeatANdMissingNumber = new RepeatAndMissingNumber();

    @Test
    public void test1() {
        ArrayList<Integer> output = repeatANdMissingNumber.repeatedNumber(new ArrayList<>(Arrays.asList(3, 1, 2, 5, 3)));
        assertEquals(Integer.valueOf(3), output.get(0));
        assertEquals(Integer.valueOf(4), output.get(1));
    }
}
