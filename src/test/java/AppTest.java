import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class AppTest {


    @Test
    public void firstmethod() {

        Assert.assertTrue(true);

    }


    @Test
    public void mathfucntion(){
        App math = new App();
        boolean sum= math.equals(22 *22);
        Assert.assertEquals(false, sum);

    }

    @Test
    public void addTest() {

        App math = new App();
        boolean result = math.equals(44);
        Assert.assertEquals(false, result);


    }

    @Test
    public void read() {


        int x= 5;
        int y=2;
        int z = x%y;
        assertTrue( z == 1);

    }



    @Test
    public void add() {

        double x = 3;
        double y = 3;
        double result = x + y;
        // forced failure result == 5
        assertTrue(result == 6);


    }


    @Test
    public void subtract() {

        double x = 4;
        double y = 3;
        double result = x - y;
        // forced failure result == 5
        assertTrue(result == 1);

    }

    @Test
    public void multiplication() {

        double x = 4;
        double y = 3;
        double result = x * y;
        // forced failure result == 5
        assertTrue(result == 12);


    }


    @Test
    public void transpose() {

        double x = 30;
        double y = 3;
        double result = x / y;
        // forced failure result == 5
        assertTrue(result == 10);


    }


    @Test
    public void printMatrix() throws Exception {

        assertEquals(2,2);

    }

    @Test
    public void testThatSucceeds() {
        // all OK
        assert true;
    }



    @RunWith(Parameterized.class)
    public static class ParameterizedTest {

        @Parameterized.Parameter
        public int expected;

        @Parameterized.Parameters
        public static Collection<Integer> data() {
            return Arrays.asList(1, 2);
        }

        @Test
        public void test() {
            assertEquals(expected, 1);
        }




    }



}