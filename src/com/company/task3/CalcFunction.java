package com.company.task3;

/**
 * Created by Ira on 01.12.2015.
 */
public class CalcFunction {


    public void calcF(double a, double b, double h){
        double x = a;
        int i = 0;
        while(x < b){

            System.out.println(x + "\t" + f(x));
            x += h;
            i++;
        }

    }

    private double f(double x){

        return (Math.tan(2*x) - 3);
    }
}
