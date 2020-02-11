package level02.bucketing;

import java.util.ArrayList;
import java.util.Comparator;

public class WaveArray {

    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        //Sort the collection in ascending order as it was mentioned in the note that , If there are multiple
        // answers possible, return the one that is lexicographically smallest , so in example case u will return [2,1,4,3]
        A.sort(Comparator.naturalOrder());
        for (int i = 0; i < A.size() - 1; i += 2) {
            Integer temp = A.get(i);
            A.set(i, A.get(i + 1));
            A.set(i + 1, temp);
        }
        return A;
    }
}
