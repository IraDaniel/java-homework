package com.company.task2;

/**
 * Created by Ira on 01.12.2015.
 */
public class MinElemFinder {

    private double a(int i){

        return (double) 1 / ((i + 1)^2);
    }

    public int findMin(double eps){
        double minA = a(1); // a1 (i = 1)
        double ai;
        int iTmp = 1;
        int i = 2;

        while(minA > eps){
            ai = a(i);
           // System.out.println(i + "  " + ai);
            if(ai < minA){
                minA = ai;
                iTmp = i;
            }
            i++;
        }

        return iTmp;
    }



}
