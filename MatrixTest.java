import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void Matrix(){

        Matrix matrix = new Matrix(1,1);
        matrix.populateMatrix(0,0,1);
        assertEquals(1,matrix.getElement(0,0));
    }
    @Test
    public void Matrix2By2(){

        Matrix matrix = new Matrix(2,2);
        matrix.populateMatrix(0,0,1);
        matrix.populateMatrix(0,1,2);
        matrix.populateMatrix(1,0,3);
        matrix.populateMatrix(1,1,4);

        assertEquals(1,matrix.getElement(0,0));
        assertEquals(2,matrix.getElement(0,1));
        assertEquals(3,matrix.getElement(1,0));
        assertEquals(4,matrix.getElement(1,1));
    }
    @Test
    public void addMatrix(){

        Matrix matrix = new Matrix(1,1);
        matrix.populateMatrix(0,0,1);

        Matrix secondMatrix = new Matrix(2,2);
        secondMatrix.populateMatrix(0,0,2);

        Matrix result = matrix.addMatrix(secondMatrix);
        assertEquals(3, result.getElement(0,0));
    }

    @Test
    public void addMatrix2By2(){

        Matrix matrix = new Matrix(2,2);
        matrix.populateMatrix(0,0,1);
        matrix.populateMatrix(0,1,2);
        matrix.populateMatrix(1,0,3);
        matrix.populateMatrix(1,1,4);

        Matrix secondMatrix = new Matrix(2,2);
        secondMatrix.populateMatrix(0,0,2);
        secondMatrix.populateMatrix(0,1,3);
        secondMatrix.populateMatrix(1,0,4);
        secondMatrix.populateMatrix(1,1,5);

        Matrix result = matrix.addMatrix(secondMatrix);
        assertEquals(3, result.getElement(0,0));
        assertEquals(5, result.getElement(0,1));
        assertEquals(7, result.getElement(1,0));
        assertEquals(9, result.getElement(1,1));
    }

}
