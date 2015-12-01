package test.java.task5;

import com.company.task5.CrossMatrix;
import org.junit.Test;

/**
 * Created by Ira on 02.12.2015.
 */
public class CrossMatrixTest {
    @Test
    public void testGetCrossMatrix()throws Exception{
        CrossMatrix crossMatrix = new CrossMatrix(4);
        crossMatrix.getCrossMatrix();

    }
}
