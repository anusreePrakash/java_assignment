public class Matrix {
    private int row, column, value;
    private int[][] matrix;
    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public void populateMatrix(int row, int column, int value){
        this.matrix[row][column] = value;
    };

    public int getElement(int row, int column){
        return this.matrix[row][column];
    };

    public Matrix addMatrix(Matrix other){
        Matrix result = new Matrix(this.row, this.column);
        for (int i = 0; i<this.row ; i++) {
            for (int j=0; j<this.column; j++) {
                result.matrix[i][j] = this.getElement(i, j) + other.getElement(i, j);
            }
        }
        return result;
    }

};
    // public void printMatrix(int row, int column){
    //     for (int i = 0 ; i < row ; i++ ) {
    //         for (int j = 0;j < column ;j++ ) {
    //             System.out.println(matrix[i][j]);
    //         };
    //     };
    // };
