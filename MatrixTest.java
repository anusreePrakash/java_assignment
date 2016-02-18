import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void Matrix(){
        Matrix matrix = new Matrix(3,3);
        int[] values = {1,2,3,4,5,6,7,8,9};
        int mat[][] = matrix.createMatrix(values);
        assertEquals(1,mat[0][0]);
        assertEquals(2,mat[0][1]);
        assertEquals(3,mat[0][2]);
        assertEquals(9,mat[2][2]);
        assertEquals(3,mat.length);
    }
}
