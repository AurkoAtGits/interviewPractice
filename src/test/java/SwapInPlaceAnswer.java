package test.java;

import main.java.SwapInPlaceQuestion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SwapInPlaceAnswer
{
    @Test
    public void testSwapInPlace()
    {
        SwapInPlaceQuestion question = new SwapInPlaceQuestion();
        ArrayList<Integer> questionArrayList = new ArrayList<>(Arrays.asList(10,5));
        ArrayList<Integer> expectedArrayList = new ArrayList<>(Arrays.asList(5,10));
        assertEquals(expectedArrayList,question.swapInPlace(questionArrayList));
    }
}
