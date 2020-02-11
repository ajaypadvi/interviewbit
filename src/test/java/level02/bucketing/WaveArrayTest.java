package level02.bucketing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class WaveArrayTest {

    private static final WaveArray waveArray = new WaveArray();

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> output = waveArray.wave(input);
        assertArrayEquals(output.toArray(), new Integer[]{2, 1, 4, 3});
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, -1, 3, -4));
        ArrayList<Integer> output = waveArray.wave(input);
        assertArrayEquals(output.toArray(), new Integer[]{-1, -4, 4, 3});
    }
}
