import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @Test
    public void sum_with3numbers(){
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
    }

    @Test
    public void sum_with1numbers(){
        assertEquals(1, myMath.sum(new int[]{1}));
    }

    @Test
    public void array(){
        String[] array = new String[]{"a", "b", "c"};
        String[] array2 = new String[]{"a", "b", "c"};

        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c"));

        assertArrayEquals(array2,array);
        assertArrayEquals(list.toArray(), list2.toArray());
    }
}
