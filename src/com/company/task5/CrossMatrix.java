package com.company.task5;

/**
 * Created by Ira on 01.12.2015.
 */
public class CrossMatrix {

    private int n; //  ךמכטקוסעגמ סעמכבצמג
    private int [][]matrixA;

    public CrossMatrix() {
    }

    public boolean getCrossMatrix(int size){
        if( n <= 0){
            return false;
        }
        n = size;
        matrixA = new int [n][n];
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
        return true;
    }


}
