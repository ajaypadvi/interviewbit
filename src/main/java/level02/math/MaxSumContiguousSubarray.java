package level02.math;

import java.util.List;

public class MaxSumContiguousSubarray {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxSum = 0;
        if (A == null || A.size() == 0) {
            return maxSum;
        }

        maxSum = A.get(0);
        int newSum = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            newSum = Math.max(A.get(i) + newSum, A.get(i));
            maxSum = Math.max(newSum, maxSum);
            System.out.printf("i = %d ,New Sum = %d, Max Sum=%d\n", i, newSum, maxSum);
        }
        return maxSum;
    }

    /**
     * Below approach will give start index and end index also in addition of max sum
     *
     * @param A
     * @return
     */
    public int maxSubArray1(final List<Integer> A) {
        int sum = 0, left = 0, leftAns = 0, rightAns = 0, maxSum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);

            if (sum <= 0) {
                left = i + 1;
                sum = 0;
            } else if (sum > maxSum) {
                leftAns = left;
                rightAns = i;
                maxSum = sum;
            }
        }
        System.out.printf("Max Sum= %d, Start=%d, End=%d", maxSum, leftAns, rightAns);
        return maxSum;
    }
}
