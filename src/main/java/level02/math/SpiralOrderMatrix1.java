package level02.math;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix1 {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (a == null || a.size() == 0) {
            return result;
        }
        int rows = a.size();
        int columns = a.get(0).size();
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        int direction = 0;
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(a.get(top).get(i));
                }
                top++;
                direction = 1;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    result.add(a.get(i).get(right));
                }
                right--;
                direction = 2;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(a.get(bottom).get(i));
                }
                bottom--;
                direction = 3;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    result.add(a.get(i).get(left));
                }
                left++;
                direction = 0;
            }
        }

        // Populate result;
        return result;
    }
}
