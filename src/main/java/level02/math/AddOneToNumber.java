package level02.math;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null || A.size() == 0) {
            return result;
        }
        int carry = 0;
        for (int i = A.size() - 1; i >= 0; i--) {
            int sum;
            if (i == A.size() - 1) {
                sum = A.get(i) + carry + 1;
            } else {
                sum = A.get(i) + carry;
            }

            if (sum > 9) {
                result.add(0);
                carry = 1;
            } else {
                result.add(sum);
                carry = 0;
            }
        }

        if (carry == 1) {
            result.add(1);
        }
        Collections.reverse(result);

        ArrayList<Integer> finalList = new ArrayList<>();
        boolean firstNonZeroNumberEncountered = false;
        for (Integer number : result) {
            if (!firstNonZeroNumberEncountered && number.equals(0)) {
            } else {
                firstNonZeroNumberEncountered = true;
                finalList.add(number);
            }
        }
        return finalList;
    }

}
