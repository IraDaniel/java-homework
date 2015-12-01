package com.company.task5;

/**
 * Created by Ira on 01.12.2015.
 */
public class CrossMatrix {

    private int n; //  ךמכטקוסעגמ סעמכבצמג
    private int [][]matrixA;

    public CrossMatrix(int n) {
        this.n = n;
        matrixA = new int [n][n];
    }

    public int [][] prepareMatrix(){
        for( int j = 0; j < n; j++){
            for( int i = 0; i < n; i++){
                if( i == j){
                    matrixA[i][j] = 1;
                }
                else if( j == ( n - (i + 1))){
                    matrixA[i][j] = 1;
                }
                else{
                    matrixA[i][j] = 0;
                }

            }
        }
        return matrixA;
    }

    public int getCrossMatrix(){
        for( int j = 0; j < n; j++){
            for( int i = 0; i < n; i++){
                if( i == j){
                    matrixA[i][j] = 1;
                }
                else if( j == ( n - (i + 1))){
                    matrixA[i][j] = 1;
                }
                else{
                    matrixA[i][j] = 0;
                }
                System.out.print(matrixA[i][j]);
                System.out.print("  ");

            }
            System.out.print("\n");
        }
        return 1;
    }

    public int printMatrix(){
        for( int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrixA[i][j]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }

        return 1;
    }
}
