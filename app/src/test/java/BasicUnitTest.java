import org.junit.Test;

import codylab.cwliu.tryrobo.Adder;
import codylab.cwliu.tryrobo.Divider;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BasicUnitTest {

    @Test
    public void test_OnePlusOne() {
        assertEquals(Adder.add(1, 1), 2);
    }

    @Test
    public void test_addDouble() {
        assertThat(Adder.add(1.4, 2.6), is(4));
    }


    @Test
    public void test_OneDivideZero() {
        int result = Divider.divide(1, 0);
        assertEquals(result, 4);
    }
}
