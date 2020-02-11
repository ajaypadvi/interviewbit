package level02.math;

import level02.math.SpiralOrderMatrix1;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralOrderMatrix1Test {

    private final SpiralOrderMatrix1 spiralOrderMatrix1 = new SpiralOrderMatrix1();

    @Test
    public void testPrintSpiralOrderMatrix() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

        ArrayList<Integer> list = spiralOrderMatrix1.spiralOrder(matrix);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)), list);

    }

}
