public class Matrix {
    private int count = 0;
    private int row;
    private int column;
    private int[][] matrix;
    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public int[][] createMatrix(int[] values){
        for (int i = 0 ; i < this.row ; i++ ) {
            for (int j = 0;j < this.column ;j++ ) {
                matrix[i][j] = values[count];
                count++;
            };
        };
        return matrix;
    };
    // public void printMatrix(int row, int column){
    //     for (int i = 0 ; i < row ; i++ ) {
    //         for (int j = 0;j < column ;j++ ) {
    //             System.out.println(matrix[i][j]);
    //         };
    //     };
    // };
};
