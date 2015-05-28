import org.junit.Test;

import codylab.cwliu.tryrobo.Adder;

import static org.junit.Assert.assertEquals;

public class BasicUnitTest {

    @Test
    public void test_OnePlusOne() {
        int result = Adder.add(1, 1);
        assertEquals(result, 2);
    }

    @Test
    public void test_OnePlusTwo() {
        int result = Adder.add(1, 2);
        assertEquals(result, 4);
    }
}
