package com.company.task4;

/**
 * Created by Ira on 01.12.2015.
 */
public class MaxElemFinder {
    double []arr;

    public MaxElemFinder(double []inputArr) {
        this.arr = inputArr;

    }

    public double findMax(){


        int n = arr.length;
        int j = n-1;
        int i = 0;
        double max = arr[i] + arr[j];
        j--;
        for( i = 1; i < n/2; i++){
            if((arr[i] + arr[j]) > max){
                max = arr[i] + arr[j];
            }
            else{
                j--;
            }
        }
        return max;
    }


}

