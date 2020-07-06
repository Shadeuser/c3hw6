import lesson6.MyTasks;
import org.junit.Assert;
import org.junit.Test;

public class HwTest {

    @Test
    public void testDoArrayFirst1() {
        MyTasks myTasks = new MyTasks();
        int[] ar = new int[] {1, 5, 7, 8, 4, 4, 6, 10};
        Assert.assertArrayEquals(new int[] {6, 10}, myTasks.doArrayFirst(ar));

    }

    @Test
    public void testDoArrayFirst2() {
        MyTasks myTasks = new MyTasks();
        int[] ar = new int[] {1, 4, 7, 8, -7, 0, 6, 10};

        Assert.assertArrayEquals(new int[] {7, 8, -7, 0, 6, 10}, myTasks.doArrayFirst(ar));
    }

    @Test
    public void testDoArrayFirst3() {
        MyTasks myTasks = new MyTasks();
        int[] ar = new int[] {};
        Assert.assertArrayEquals(null, myTasks.doArrayFirst(ar));

    }

    @Test
    public void testDoArrayFirst4() {
        MyTasks myTasks = new MyTasks();
        int[] ar = new int[] {1, 5, 7, 8, 3, 0, 6, 25};
        Assert.assertArrayEquals(null, myTasks.doArrayFirst(ar));
    }

}
