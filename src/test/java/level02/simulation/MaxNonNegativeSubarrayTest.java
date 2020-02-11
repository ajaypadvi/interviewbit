package level02.simulation;

import level02.simulation.MaxNonNegativeSubarray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxNonNegativeSubarrayTest {

    private final static MaxNonNegativeSubarray maxNonNegativeSubarray = new MaxNonNegativeSubarray();
    //1, 2, 5, -7, 2, 3 -- 1, 2, 5
    //0, -1, 2, 3, -4, 100 -- 100

    @Test
    public void test1() {
        ArrayList<Integer> output = maxNonNegativeSubarray.maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3)));
        assertEquals(output, new ArrayList<>(Arrays.asList(1, 2, 5)));
    }

    @Test
    public void test2() {
        ArrayList<Integer> output = maxNonNegativeSubarray.maxset(new ArrayList<>(Arrays.asList(0, -1, 2, 3, -4, 100)));
        assertEquals(output, new ArrayList<>(Collections.singletonList(100)));
    }
}
