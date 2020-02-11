package level02.math;

import level02.math.MaxSumContiguousSubarray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxSumContiguousSubarrayTest {
    private static final MaxSumContiguousSubarray maxSumContiguousSubarray = new MaxSumContiguousSubarray();

    @Test //[1, 2, 3, 4, -10]
    public void test1() {
        int sum = maxSumContiguousSubarray.maxSubArray(new ArrayList<>(Arrays.asList(1, 2, 3, 4, -10)));
        assertEquals(10, sum);
    }

    @Test //[-2, 1, -3, 4, -1, 2, 1, -5, 4]
    public void test2() {
        int sum = maxSumContiguousSubarray.maxSubArray(new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
        assertEquals(6, sum);
    }

    @Test //[1, 2, 3, 4, -10]
    public void test3() {
        int sum = maxSumContiguousSubarray.maxSubArray1(new ArrayList<>(Arrays.asList(1, 2, 3, 4, -10)));
        assertEquals(10, sum);
    }

    @Test //[-2, 1, -3, 4, -1, 2, 1, -5, 4]
    public void test4() {
        int sum = maxSumContiguousSubarray.maxSubArray1(new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
        assertEquals(6, sum);
    }
}
