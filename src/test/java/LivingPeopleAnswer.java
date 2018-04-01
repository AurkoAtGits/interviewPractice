package test.java;

import main.java.LivingPeopleQuestion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LivingPeopleAnswer
{
    @Test
    public void testGetMaxAliveYear()
    {
        LivingPeopleQuestion question = new LivingPeopleQuestion();
        ArrayList<int[]> yearPair = new ArrayList<>(Arrays.asList(new int[]{1909,1910},
                new int[]{1909,1911},
                new int[]{1909,1912}));
        int actualYear = question.getMaxAliveYear(yearPair);
        assertEquals(1909,actualYear);
    }
}
