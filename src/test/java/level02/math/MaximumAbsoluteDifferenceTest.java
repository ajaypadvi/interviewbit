package level02.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAbsoluteDifferenceTest {

    private final MaximumAbsoluteDifference maximumAbsoluteDifference = new MaximumAbsoluteDifference();

    @Test//1, 3, -1
    public void test1() {
        int maxAbsoluteDifference = maximumAbsoluteDifference.maxArr(new ArrayList<>(Arrays.asList(1, 3, -1)));
        assertEquals(5, maxAbsoluteDifference);
    }

    @Test//1, 3, -1
    public void test2() {
        int maxAbsoluteDifference = maximumAbsoluteDifference.maxArr(new ArrayList<>(Arrays.asList(2, 2, 2)));
        assertEquals(2, maxAbsoluteDifference);
    }
}
