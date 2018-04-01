package test.java;

import main.java.TestQuestion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnswer
{
    @Test
    public void testPriorityQueue()
    {
        TestQuestion testQuestion = new TestQuestion();
        int[] testArray = new int[] {10, 7, 11, 8, 13, 5};
        int actual = testQuestion.getMaxProfit(testArray);
        assertEquals(6, actual);
    }
}
