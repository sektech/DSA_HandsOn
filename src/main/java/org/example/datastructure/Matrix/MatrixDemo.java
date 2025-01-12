package org.example.datastructure.Matrix;

public class MatrixDemo {

    public static void main(String[] args) {

        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       displayMatrix(matrix1);

       displayMatrix( add2Matrix(matrix1,matrix2));
        displayMatrix( sub2Matrix(matrix1,matrix2));
        System.out.println();
        displayMatrix(transposeMatrix(matrix1));

    }

    static int[][] transposeMatrix(int[][] a){
        int[][] transposeMatrix = new int[3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                transposeMatrix[i][j] = a[j][i] ;
            }
        }
        return transposeMatrix;
    }
    static int[][] sub2Matrix(int[][] a, int[][] b){
        int[][] addedMatrix = new int[3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                addedMatrix[i][j] = a[i][j] - b[i][j];
            }
        }
        return addedMatrix;
    }
    static int[][] add2Matrix(int[][] a, int[][] b){
        int[][] addedMatrix = new int[3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                addedMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return addedMatrix;
    }
    static void displayMatrix(int[][] matrix){
        for(int i=0; i<3;i++){

            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        };
    }
}
