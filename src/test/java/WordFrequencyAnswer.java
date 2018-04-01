package test.java;

import main.java.WordFrequencyQuestion;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordFrequencyAnswer
{
    static WordFrequencyQuestion question;

    @BeforeClass
    public static void setUp()
    {
        String book = "This a book string. A book string this is.";
        question = new WordFrequencyQuestion(book);
    }

    @Test
    public void testWordFrequency()
    {
        int actualCount = question.getWordFrequency("book");
        int expectedCount = 2;
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testWordFrequencyWithFullStop()
    {
        int actualCount = question.getWordFrequency("string");
        int expectedCount = 2;
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testWordNotPresent()
    {
        int actualCount = question.getWordFrequency("string1");
        int expectedCount = 0;
        assertEquals(expectedCount, actualCount);
    }
}
