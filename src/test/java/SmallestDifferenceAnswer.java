package test.java;

import main.java.SmallestDifferenceQuestion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestDifferenceAnswer
{
    @Test
    public void testCalculateMinDiff()
    {
        int[] array1 = new int[] {1, 3, 15, 11, 2};
        int[] array2 = new int[] {23, 127, 235, 19, 8};
        SmallestDifferenceQuestion question = new SmallestDifferenceQuestion();
        int actualDiff = question.calculateMinDiff(array1,array2);
        assertEquals(3, actualDiff);
    }
}
