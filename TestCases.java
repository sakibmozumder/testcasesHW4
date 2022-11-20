package hw4avg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    // average zero when k and list.length both are 0
    public void divideByZeroBoth(){
        Average avrg=new Average();
        int[] lst = {};
        assertEquals(0,avrg.average(0,lst));
    }
    @Test
    // average zero when only k is zero
    public void divideByZeroK(){
        Average avrg=new Average();
        int[] lst = {1,2,3,4,5};
        assertEquals(0,avrg.average(0,lst));
    }
    @Test
    // average zero when only list.length is zero
    public void divideByZeroList(){
        Average avrg=new Average();
        int[] lst = {};
        assertEquals(0,avrg.average(3,lst));
    }
    @Test
    // average zero when k is negative
    public void divideByNegative(){
        Average avrg=new Average();
        int[] lst = {1,2,3,4,5};
        assertEquals(0,avrg.average(-3,lst));
    }
    @Test
    // average when k < list.length
    public void divideByK(){
        Average avrg=new Average();
        int[] lst = {1,2,3,4,5};
        assertEquals(2,avrg.average(3,lst));
    }
    @Test
    // average when k > list.length
    public void divideByLength(){
        Average avrg=new Average();
        int[] lst = {1,2,3,4,5};
        assertEquals(3,avrg.average(7,lst));
    }
    @Test
    // average when k == list.length
    public void divideByAny(){
        Average avrg=new Average();
        int[] lst = {1,2,3,4,5};
        assertEquals(3,avrg.average(5,lst));
    }

}
