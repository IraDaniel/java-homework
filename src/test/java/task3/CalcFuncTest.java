package test.java.task3;

import com.company.task3.CalcFunction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ira on 01.12.2015.
 */
public class CalcFuncTest {
    @Test
    public void testCalcF()throws Exception{
        CalcFunction calcFunction = new CalcFunction();
        assertTrue(calcFunction.calcF(0.1, 10.2, 2));
        assertFalse(calcFunction.calcF(20, 10.2, 2));
    }
}
