package test.java.task2;

import com.company.task2.MinElemFinder;
import org.junit.Test;

/**
 * Created by Ira on 02.12.2015.
 */
public class MinElemFinderTest {
    @Test
    public void testFindMin()throws Exception{
        MinElemFinder minElemFinder = new MinElemFinder();
        System.out.println(minElemFinder.findMin(0.000001));
     //   System.out.println(minElemFinder.findMin(0.000001));

    }
}
