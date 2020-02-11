package level02.math;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

    public int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MIN_VALUE,
                min1 = Integer.MAX_VALUE,
                max2 = Integer.MIN_VALUE,
                min2 = Integer.MAX_VALUE;
        int maxAbsoluteDiff;

        for (int i = 0; i < A.size(); i++) {
            max1 = Math.max(A.get(i) + i, max1);
            min1 = Math.min(A.get(i) + i, min1);
            max2 = Math.max(A.get(i) - i, max2);
            min2 = Math.min(A.get(i) - i, min2);
        }
        maxAbsoluteDiff = Math.max(max1 - min1, max2 - min2);
        //System.out.printf("maximum absolute diff is %d", maxAbsoluteDiff);
        return maxAbsoluteDiff;
    }
}
