package test.java.task4;

import com.company.task4.MaxElemFinder;
import com.company.task5.CrossMatrix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ira on 06.12.2015.
 */
public class MaxElemFindTest {
    @Test
    public void testGetMaxElem()throws Exception{
        double [] b = {1,2,3,4,5};
        MaxElemFinder maxElemFinder = new MaxElemFinder(b);
        //System.out.println(maxElemFinder.findMax());
        assertEquals(5,maxElemFinder.findMax(),0.1);

        //CrossMatrix crossMatrix = new CrossMatrix();
      //  assertTrue(crossMatrix.getCrossMatrix(4));

    }
}
