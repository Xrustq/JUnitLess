package task2;

import org.junit.Assert;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


public class CalculatePRNTest extends Assert {

    private String [] addition = {"10", "5", "+"};
    private String [] subtraction = {"10", "5", "-"};
    private String [] division = {"10", "5", "/"};
    private String [] multiplication = {"10", "5", "*"};
    private String [] divisionByZero = {"10", "0", "/"};
    private String [] wrongCharacters = {"10c", "0", "/"};


    @Test
    public void additionTest() {
        assertThat(CalculatePRN.evalRPN(addition), is(equalTo(15)));
    }

    @Test
    public void subtractionTest() {
        assertThat( CalculatePRN.evalRPN(subtraction), is(equalTo(5)));
    }

    @Test
    public void divisionTest() {
        assertThat(CalculatePRN.evalRPN(division), is(equalTo(2)));
    }

    @Test
    public void multiplicationTest() {
        assertThat(CalculatePRN.evalRPN(multiplication), is(equalTo(50)));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroTest() {
        CalculatePRN.evalRPN(divisionByZero);
    }

    @Test(expected = EmptyStackException.class)
    public void wrongCharacters() {
        CalculatePRN.evalRPN(wrongCharacters);
    }
}