package main.java;

/**
 * Given 2 arrays of integers compute the pair of values(one from each array) with the
 * smallest (non-negative) difference. Return the difference.
 */
public class SmallestDifferenceQuestion
{
    //Create meathod which will accept 2 arrays.
    // Call impl method to solve the question.
    //Return the answer
    public int calculateMinDiff(int[] array1, int[] array2)
    {
        return calculateMinDiffImpl(array1,array2);
    }


    //Method to solve the question
    private int calculateMinDiffImpl(int[] array1, int[] array2)
    {
        int min = Math.abs(array1[0] - array2[0]);
        for(int a1count = 0; a1count < array1.length; a1count++)
        {
            for(int a2count = 0; a2count < array2.length; a2count++)
            {
                if((Math.abs(array1[a1count] - array2[a2count])) < min)
                {
                    min = Math.abs(array1[a1count] - array2[a2count]);
                }
            }
        }
        return min;
    }
}
