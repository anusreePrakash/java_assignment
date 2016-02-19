import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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

        Matrix secondMatrix = new Matrix(1,1);
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

    @Test
    public void addUnEqualMatrix(){

        Matrix matrix = new Matrix(1,1);
        matrix.populateMatrix(0,0,1);

        Matrix secondMatrix = new Matrix(2,1);
        secondMatrix.populateMatrix(0,0,2);

        assertNull(matrix.addMatrix(secondMatrix));
    }

    @Test
    public void ProductOfMatrices(){

        Matrix matrix = new Matrix(1,1);
        matrix.populateMatrix(0,0,1);

        Matrix secondMatrix = new Matrix(1,1);
        secondMatrix.populateMatrix(0,0,2);

        Matrix result = matrix.findProduct(secondMatrix);
        assertEquals(2, result.getElement(0,0));
    }

    @Test
    public void ProductOfMatrices2By2(){

        Matrix matrix = new Matrix(2,2);
        matrix.populateMatrix(0,0,1);
        matrix.populateMatrix(0,1,2);
        matrix.populateMatrix(1,0,3);
        matrix.populateMatrix(1,1,4);

        Matrix secondMatrix = new Matrix(2,2);
        secondMatrix.populateMatrix(0,0,2);
        secondMatrix.populateMatrix(0,1,0);
        secondMatrix.populateMatrix(1,0,1);
        secondMatrix.populateMatrix(1,1,2);

        Matrix result = matrix.findProduct(secondMatrix);
        assertEquals(4, result.getElement(0,0));
        assertEquals(4, result.getElement(0,1));
        assertEquals(10, result.getElement(1,0));
        assertEquals(8, result.getElement(1,1));
    }

    @Test
    public void ProductOfMatricesDifferentDimension(){

        Matrix matrix = new Matrix(2,4);
        matrix.populateMatrix(0,0,1);
        matrix.populateMatrix(0,1,2);
        matrix.populateMatrix(0,2,3);
        matrix.populateMatrix(0,3,4);
        matrix.populateMatrix(1,0,5);
        matrix.populateMatrix(1,1,6);
        matrix.populateMatrix(1,2,7);
        matrix.populateMatrix(1,3,8);

        Matrix secondMatrix = new Matrix(4,3);
        secondMatrix.populateMatrix(0,0,1);
        secondMatrix.populateMatrix(0,1,2);
        secondMatrix.populateMatrix(0,2,3);
        secondMatrix.populateMatrix(1,0,4);
        secondMatrix.populateMatrix(1,1,5);
        secondMatrix.populateMatrix(1,2,6);
        secondMatrix.populateMatrix(2,0,7);
        secondMatrix.populateMatrix(2,1,8);
        secondMatrix.populateMatrix(2,2,9);
        secondMatrix.populateMatrix(3,0,10);
        secondMatrix.populateMatrix(3,1,11);
        secondMatrix.populateMatrix(3,2,12);

        Matrix result = matrix.findProduct(secondMatrix);
        assertEquals(70, result.getElement(0,0));
        assertEquals(80, result.getElement(0,1));
        assertEquals(90, result.getElement(0,2));
        assertEquals(158, result.getElement(1,0));
        assertEquals(184, result.getElement(1,1));
        assertEquals(210, result.getElement(1,2));

    }
    @Test
    public void ProductOfMatricesInUnSatisfiedCondition(){

        Matrix matrix = new Matrix(1,1);
        matrix.populateMatrix(0,0,1);

        Matrix secondMatrix = new Matrix(2,1);
        secondMatrix.populateMatrix(0,0,2);

        assertNull(matrix.findProduct(secondMatrix));
    }

}
