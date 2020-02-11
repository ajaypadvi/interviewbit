package level02.bucketing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class NobleNumberTest {

    private final NobleNumber nobleNumber = new NobleNumber();

    @Test
    public void test1() {
        int isNoble = nobleNumber.solve(new ArrayList<>(Arrays.asList(6, 4, 5, 3)));
        assertEquals(1, isNoble);
    }

    @Test
    public void test2() {
        int isNoble = nobleNumber.solve(new ArrayList<>(Arrays.asList(5, 3, 2, 1, 4, 6)));
        assertEquals(1, isNoble);
    }
}
