package com.company.task4;

/**
 * Created by Ira on 01.12.2015.
 */
public class MaxElemFinder {
    private double []arr;
    private int n;

    public MaxElemFinder(double[] arr) {
        this.arr = arr;
    }



    public double [] prepareMatrix(){

        double []arrB = new double[n];
        for( int i = 0; i < n; i++){
            arrB[i] = arr[i] + arr[2*n-i-1];
        }
        return arrB;

    }

    public double findMaxElem(){
        double maxElem = 0.0;
        double [] arrB =  prepareMatrix();
        for( int i = 0; i < n; i++){
            if(arr[i] > maxElem){
                maxElem = arrB[i];
            }
        }
        return maxElem;
    }
}

