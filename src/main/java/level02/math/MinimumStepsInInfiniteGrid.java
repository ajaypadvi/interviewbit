package level02.math;

import java.util.ArrayList;

public class MinimumStepsInInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        if (A == null || B == null) {
            return steps;
        }
        if (A.size() == 0 || B.size() == 0 || A.size() != B.size()) {
            return steps;
        }
        int size = A.size();
        for (int i = 0; i <= size - 2; i++) {
            steps += Math.max(
                    Math.abs(A.get(i + 1) - A.get(i)),
                    Math.abs(B.get(i + 1) - B.get(i))
            );
        }
        return steps;
    }
}
