package level02.math;

import level02.math.AddOneToNumber;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumberTest {

    private final AddOneToNumber addOneToNumber = new AddOneToNumber();

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> output = addOneToNumber.plusOne(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 4)), output);
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 9));
        ArrayList<Integer> output = addOneToNumber.plusOne(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 3, 0)), output);
    }

    @Test //9, 9, 9, 9, 9
    public void test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 9, 9, 9, 9 ));
        ArrayList<Integer> output = addOneToNumber.plusOne(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 0, 0 ,0, 0, 0)), output);
    }
}
