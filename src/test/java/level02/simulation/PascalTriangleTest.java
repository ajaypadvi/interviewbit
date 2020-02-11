package level02.simulation;

import org.junit.Test;

import java.util.ArrayList;

public class PascalTriangleTest {

    private final PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    public void test1() {
        ArrayList<ArrayList<Integer>> answer = pascalTriangle.solve(5);
        answer.forEach(list -> {
            list.forEach(e -> {
                System.out.printf("%d ", e);
            });
            System.out.println("");
        });

    }
}
