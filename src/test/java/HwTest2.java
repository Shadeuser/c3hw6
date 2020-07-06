import lesson6.MyTasks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HwTest2 {
    MyTasks myTasks;
    boolean testResult;
    int[] ar;

    public HwTest2(boolean testResult, int[] ar) {
        this.testResult = testResult;
        this.ar = ar;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> MassTestSecond() {
        return Arrays.asList(new Object[][]{
                {false, new int[]{0, 3, 5, 9}},
                {true, new int[]{1, 4, 2, 2, 6}},
                {true, new int[]{0, -7, 2, 2, 4}},
                {false, new int[]{0, 0, 0, 0, 0, 0}}
        });
    }

    ;

    @Before
    public void init() {
        myTasks = new MyTasks();
    }

    @Test
    public void testSecond() {
        Assert.assertEquals(testResult, myTasks.doArraySecond(ar));
    }


}
