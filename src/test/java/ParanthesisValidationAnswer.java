package test.java;

import main.java.ParanthesisValidationQuestion;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParanthesisValidationAnswer
{
    @Test
    public void testValidateStringCorrectString ()
    {
        String testString = "{ how ( are ) [ you ] } ?";
        ParanthesisValidationQuestion question = new ParanthesisValidationQuestion();
        assertTrue(question.validateString(testString));
    }

    @Test
    public void testValidateStringNoEndingCurly ()
    {
        String testString = "{ how ( are ) [ you ] ?";
        ParanthesisValidationQuestion question = new ParanthesisValidationQuestion();
        assertFalse(question.validateString(testString));
    }

    @Test
    public void testValidateStringNoStartingCurly ()
    {
        String testString = "how ( are ) [ you ] } ?";
        ParanthesisValidationQuestion question = new ParanthesisValidationQuestion();
        assertFalse(question.validateString(testString));
    }

    @Test
    public void testValidateStringExtraCurlyAtEnd ()
    {
        String testString = "{ how ( are ) [ you ] } } ?";
        ParanthesisValidationQuestion question = new ParanthesisValidationQuestion();
        assertFalse(question.validateString(testString));
    }

    @Test
    public void testValidateStringUnorderedBrackets()
    {
        String testString = "{ how [ are ( you ] ) }";
        ParanthesisValidationQuestion question = new ParanthesisValidationQuestion();
        assertFalse(question.validateString(testString));
    }
}
