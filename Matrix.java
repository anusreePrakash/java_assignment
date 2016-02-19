public class Matrix {
    private int row, column, value;
    private int[][] matrix;
    private int sum = 0;
    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    };

    public void populateMatrix(int row, int column, int value){
        this.matrix[row][column] = value;
    };

    public int getElement(int row, int column){
        return this.matrix[row][column];
    };

    public boolean isSameOrder(Matrix other){
        if(this.row == other.row && this.column == other.column)
        return  true;
        return false;
    }

    public boolean isEqualMatrix(Matrix other){
        if(this.matrix == other.matrix)
        return true;
        return false;
    }

    public Matrix addMatrix(Matrix other){
        if(!this.isSameOrder(other)){
            return null;
        }
        else{
            Matrix result = new Matrix(this.row, this.column);
            for (int i = 0; i<this.row ; i++) {
                for (int j=0; j<this.column; j++) {
                    result.matrix[i][j] = this.getElement(i, j) + other.getElement(i, j);
                }
            }
            return result;
        }
    }

    public Matrix findProduct(Matrix other){
        if(!(this.column == other.row))
        return null;
        else{
            Matrix result = new Matrix(this.row, other.column);
            for ( int i = 0 ; i < this.row ; i++ ) {
                for ( int j = 0 ; j < other.column ; j++ ) {
                    for ( int k = 0 ; k < other.row ; k++ ){
                        sum = sum + this.getElement(i,k)*other.getElement(k,j);
                    }
                    result.matrix[i][j] = sum;
                    sum = 0;
                }
            }
            return result;
        }
    }

};
    // public void printMatrix(int row, int column){
    //     for (int i = 0 ; i < row ; i++ ) {
    //         for (int j = 0;j < column ;j++ ) {
    //             System.out.println(matrix[i][j]);
    //         };
    //     };
    // };
