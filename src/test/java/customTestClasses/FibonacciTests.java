package customTestClasses;


import org.example.Exceptions.negativeElementException;
import org.example.Fibonacci;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FibonacciTests {


    private Fibonacci fb;
    @Before
    public void createFibonacci()
    {
        fb = new Fibonacci();
    }
    @Test(expected = negativeElementException.class)
    public void fibonacciSeriesforGivenNegativenumber() throws negativeElementException {
        fb.setN(-7);
    }

    @Test
    public void finacciSeriesForGivenNumber() throws negativeElementException{
        fb.setN(7);
        ArrayList<Integer> resultseries = fb.generateFibonacci_classic();
        ArrayList<Integer> expectedseries = new ArrayList<Integer>(){
            {
                add(0);
                add(1);
                add(1);
                add(2);
                add(3);
                add(5);
                add(8);
            }
        };
        Assert.assertEquals(expectedseries,resultseries);
    }
}
