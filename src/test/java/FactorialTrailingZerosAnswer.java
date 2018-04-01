package test.java;

import main.java.FactorialTrailingZerosQuestion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTrailingZerosAnswer
{
    @Test
    public void testCalculateFactorial()
    {
        FactorialTrailingZerosQuestion question = new FactorialTrailingZerosQuestion();
        double actualFactorial = question.calculateFactorial(4);
        assertEquals(24.0, actualFactorial, 0);
    }
}
