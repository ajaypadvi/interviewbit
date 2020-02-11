package level02.simulation;

import java.util.ArrayList;

public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        if (A == null || A.size() == 0) {
            return answer;
        }

        int i, j;

        int m = A.size();
        int n = A.get(0).size();
        for (int k = 0; k < n; k++) {
            j = k;
            i = 0;
            ArrayList<Integer> temp = new ArrayList<>();
            while (j >= 0) {
                temp.add(A.get(i).get(j));
                i++;
                j--;
            }
            answer.add(temp);
        }

        for (int k = 1; k < m; k++) {
            i = k;
            j = m - 1;
            ArrayList<Integer> temp = new ArrayList<>();
            while (i <= m - 1) {
                temp.add(A.get(i).get(j));
                i++;
                j--;
            }
            answer.add(temp);
        }
        return answer;
    }
}
