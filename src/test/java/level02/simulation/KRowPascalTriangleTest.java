package level02.simulation;

import org.junit.Test;

import java.util.ArrayList;

public class KRowPascalTriangleTest {

    private final KRowPascalTriangle kRowPascalTriangle = new KRowPascalTriangle();

    @Test
    public void test1() {
        ArrayList<Integer> row = kRowPascalTriangle.getRow1(5);
        System.out.println(row);
    }
}
