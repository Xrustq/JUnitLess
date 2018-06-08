package task2;

import org.junit.Assert;

import org.junit.Test;



public class CalculatePRNTest extends Assert {

    private String [] addition = {"10", "5", "+"};
    private String [] subtraction = {"10", "5", "-"};
    private String [] division = {"10", "5", "/"};
    private String [] multiplication = {"10", "5", "*"};
    private String [] divisionByZero = {"10", "0", "/"};


    @Test
    public void additionTest() {
        assertEquals(15, CalculatePRN.evalRPN(addition));
    }

    @Test
    public void subtractionTest() {
        assertEquals(5, CalculatePRN.evalRPN(subtraction));
    }

    @Test
    public void divisionTest() {
        assertEquals(2, CalculatePRN.evalRPN(division));
    }

    @Test
    public void multiplicationTest() {
        assertEquals(50, CalculatePRN.evalRPN(multiplication));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroTest() {
        assertEquals("/ by zero",CalculatePRN.evalRPN(divisionByZero));
    }
}