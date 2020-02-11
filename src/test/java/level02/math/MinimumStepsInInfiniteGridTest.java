package level02.math;

import level02.math.MinimumStepsInInfiniteGrid;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumStepsInInfiniteGridTest {

    MinimumStepsInInfiniteGrid minimumStepsInInfiniteGrid = new MinimumStepsInInfiniteGrid();

    @Test
    public void testMinSteps() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0, 1, 2));
        int steps = minimumStepsInInfiniteGrid.coverPoints(A, B);
        System.out.print(steps);
    }
}
