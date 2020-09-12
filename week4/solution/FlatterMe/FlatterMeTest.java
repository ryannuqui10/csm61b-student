import org.junit.Test;
import static org.junit.Assert.*;

public class FlatterMeTest {
    @Test
    public void testMiddleOne() {
        int[] testArr0 = {0};
        int[] testArr1 = {1};
        assertEquals(0, FlatterMe.middle(testArr0));
    }

    @Test
    public void testMiddleEven() {
        int[] testArr0 = {0, 1};
        int[] testArr1 = {0, 1, 2, 3};
        assertEquals(0, FlatterMe.middle(testArr0));
        assertEquals(1, FlatterMe.middle(testArr0));
    }

    @Test
    public void testMiddleOdd() {
        int[] testArr0 = {0, 1, 2};
        int[] testArr1 = {0, 1, 2, 3, 4};
        assertEquals(1, FlatterMe.middle(testArr0));
        assertEquals(2, FlatterMe.middle(testArr0));
    }
}
