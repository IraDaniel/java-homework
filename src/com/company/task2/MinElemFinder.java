package com.company.task2;

/**
 * Created by Ira on 01.12.2015.
 */
public class MinElemFinder {

    private double a(int i){
        return (double) 1 / ((i + 1)^2);
    }

    public int findMin(double eps){
        double tmp = a(1); // a1 (i = 1)
        double ai = tmp;
        int iTmp = 1;
        int i = 2;
        while(ai < eps){
            ai = a(i);
            System.out.println(ai);
            if(ai > tmp){
                tmp = ai;
                iTmp = i;
            }
            i++;
        }

        return iTmp;
    }



}
