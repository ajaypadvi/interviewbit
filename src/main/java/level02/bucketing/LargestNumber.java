package level02.bucketing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    // DO NOT MODIFY THE LIST
    public String largestNumber(final List<Integer> A) {
//        ArrayList<String> temp = new ArrayList<>();
//        StringBuilder builder = new StringBuilder();
//        for (Integer integer : a) {
//            temp.add(String.valueOf(integer));
//        }
//        temp.sort(Comparator.reverseOrder());
//        for (String s : temp) {
//            builder.append(s);
//        }
//
//        System.out.printf("After sorting integer array and later concatenating strings, the number becomes {%s} ", builder.toString());
//        return builder.toString();
//
        StringBuilder outputString = new StringBuilder();
        A.sort((X, Y) -> {

            String XY = String.valueOf(X) +
                    Y;
            String YX = String.valueOf(Y) +
                    X;
            return YX.compareTo(XY);
        });

        boolean foundPositiveInteger = false;
        int i = 0;
        while (!foundPositiveInteger && i < A.size()) {
            if (A.get(i) == 0) {
                i++;
                continue;
            }
            foundPositiveInteger = true;
        }

        for (int k = i; k < A.size(); k++) {
            outputString.append(A.get(k));
        }

        if (!foundPositiveInteger)
            return "0";
        return outputString.toString();
    }

}
