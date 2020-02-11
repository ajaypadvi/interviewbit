package level02.simulation;

import org.junit.Test;

import java.util.ArrayList;

public class SpiralOrderMatrix2Test {
    private static final SpiralOrderMatrix2 spiralOrderMatrix2 = new SpiralOrderMatrix2();

    @Test
    public void test1() {
        ArrayList<ArrayList<Integer>> output = spiralOrderMatrix2.generateMatrix(3);
        for (ArrayList<Integer> row : output) {
            System.out.println(row);
        }
    }
}
