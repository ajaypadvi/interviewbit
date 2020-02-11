package level02.simulation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonalsTest {

    private static final AntiDiagonals antiDiagonals = new AntiDiagonals();

    @Test
    public void test1() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        input.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        input.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> output = antiDiagonals.diagonal(input);
        output.forEach(System.out::println);
    }

    @Test
    public void test2() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 2)));
        input.add(new ArrayList<>(Arrays.asList(3, 4)));

        ArrayList<ArrayList<Integer>> output = antiDiagonals.diagonal(input);
        output.forEach(System.out::println);
    }

    @Test
    public void test3() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        input.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        input.add(new ArrayList<>(Arrays.asList(7, 8, 9, 10)));
        input.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14)));

        ArrayList<ArrayList<Integer>> output = antiDiagonals.diagonal(input);
        output.forEach(System.out::println);
    }
}
