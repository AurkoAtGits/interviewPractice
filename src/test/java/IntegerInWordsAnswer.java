package test.java;

import main.java.IntegerInWordsQuestion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerInWordsAnswer
{
    @Test
    public void testConvertNumberToString()
    {
        IntegerInWordsQuestion question = new IntegerInWordsQuestion();
        String actual = question.convertNumberToString(1234);
        String expected = "One Thousand Two Hundred Thirty Four";
        assertEquals(expected,actual);
    }
}
