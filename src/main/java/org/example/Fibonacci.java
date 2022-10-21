package org.example;

import org.example.Exceptions.negativeElementException;

import java.util.ArrayList;

public class Fibonacci {

    private int n;
    private ArrayList<Integer> series;

    public void setN (int n) throws negativeElementException {
        this.n = n;
        try{
            series=new ArrayList<Integer>(n);
        }catch (IllegalArgumentException ex){
            throw new negativeElementException("Cant Generate a series with less than one number");
        }
    }

    public ArrayList<Integer> generateFibonacci_classic(){
        int first_no = 0;
        int second_no = 1;
        for(int i=0;i<n;i++){
            series.add(first_no);
            int temp = first_no+second_no;
            first_no = second_no;
            second_no = temp;
        }
        return series;
    }
}
