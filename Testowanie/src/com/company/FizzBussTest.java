package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FizzBussTest {
    FizzBuss testObject = new FizzBuss();

    @Test
    public void shouldReturnEmptyArrayWhenZeroProvided(){
        Assert.assertArrayEquals(new String[0],testObject.fizzBuss(0));
    }
    @Test
    public void shouldReturnArrayWithOnlyWhen1Provided(){
        Assert.assertArrayEquals(new String[]{"1"},testObject.fizzBuss(1));
}
    @Test
        public void shouldReturnArrayWithOnlyWhen2Provided() {
    Assert.assertArrayEquals(new String[]{"1","2"}, testObject.fizzBuss(2));
}
    @Test
    public void shouldReturnArrayWithOnlyWhen3Provided() {
        Assert.assertArrayEquals(new String[]{"1","2","Fizz"}, testObject.fizzBuss(3));
    }
    @Test
    public void shouldReturnArrayWithOnlyWhen5Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buss"}, testObject.fizzBuss(5));
    }

    @Test
    public void shouldReturnArrayWith2FizzOn3rdAnd6thPositionWhen6Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buss","Fizz"},testObject.fizzBuss(6));
    }

    @Test
    public void shouldReturnArrayWithOnlyWhen10Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buss","Fizz","7","8","Fizz","Buss"},
                testObject.fizzBuss(10));

    }
    @Test

    public void houldReturnFizzBussWhenElemntIs15(){
        Assert.assertEquals("FizzBuss", testObject.getStringRepresentation(15));
    }
    @Test

    public void houldReturnFizzBussWhenElemntIs105(){
        Assert.assertEquals("FizzBuss", testObject.getStringRepresentation(105));
    }

}
