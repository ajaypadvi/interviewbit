package level02.simulation;

import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        if (A == 0) {
            return answer;
        }

        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        for (int i = 1; i < A; i++) {
            answer.add(new ArrayList<>());
            answer.get(i).add(1);

            ArrayList<Integer> previousList = answer.get(i - 1);
            for (int j = 0; j < previousList.size() - 1; j++) {
                answer.get(i).add(previousList.get(j) + previousList.get(j + 1));
            }
            answer.get(i).add(1);
        }
        return answer;
    }
}
