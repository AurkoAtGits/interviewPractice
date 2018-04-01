package test.java;

import main.java.MergeSortQuestion;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortAnswer
{
    @Test
    public void testMergeSortImpl()
    {
        int[] inputArray = new int[] {6,3,8,1,4,9,2};
        int[] expectedOutput = new int[]{1, 2, 3, 4, 6, 8, 9};
        MergeSortQuestion mergeSortQuestion = new MergeSortQuestion();
        int[] outputArray = mergeSortQuestion.mergeSortImpl(inputArray);
        for(int i=0; i<inputArray.length; i++)
            Assert.assertEquals(expectedOutput[i], outputArray[i]);
    }
}
