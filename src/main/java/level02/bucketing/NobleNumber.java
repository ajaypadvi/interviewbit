package level02.bucketing;

import java.util.ArrayList;
import java.util.Comparator;

public class NobleNumber {

    public int solve(ArrayList<Integer> A) {
        int isNoble = -1;

        if (A == null || A.size() == 0) {
            return isNoble;
        }

        int n = A.size();
        // Sort the Array
        A.sort(Comparator.naturalOrder());
        for (int i = 0; i < n; i++) {
            while (i < n - 1 && A.get(i + 1).equals(A.get(i))) {
                // In case of duplicates, skip the duplicates and
                // always consider last available duplicate
                //eg 2,2,2,1 in this case consider the duplicate element 2 at 2nd index(zero based starting from 0)
                i++;
            }

            if (A.get(i) == Math.abs(n - i - 1)) {
                // For a number to be a Noble Number, the number of elements which are on the right of the that number
                // should be equal to the number
                isNoble = 1;
                break;
            }
        }
        return isNoble;
    }
}
