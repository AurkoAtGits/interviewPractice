package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParanthesisValidationQuestion
{
    public boolean validateString(String string)
    {
        List<String> sanitizedString = getSanitizedString(string);
        return parseString(sanitizedString);
    }

    private List<String> getSanitizedString(String string)
    {
        String[] splitString = string.split (" ");
        return (Arrays.asList(splitString));
    }

    private boolean parseString(List<String> sanitizedString)
    {
        Stack<String> bracketStack = new Stack<>();
        for(String string : sanitizedString)
        {
            if(string.equals("(")|| string.equals("{") || string.equals("["))
            {
                bracketStack.push(string);
            }
            else if(string.equals(")") || string.equals("}") || string.equals("]"))
            {
                switch(string)
                {
                    case ")":
                        if(bracketStack.isEmpty() || !bracketStack.pop().equals("("))
                            return false;
                    break;
                    case "}":
                        if(bracketStack.isEmpty() || !bracketStack.pop().equals("{"))
                            return false;
                        break;
                    case "]":
                        if(bracketStack.isEmpty() || !bracketStack.pop().equals("["))
                            return false;
                        break;
                    default:
                }
            }
        }
        if(!bracketStack.isEmpty())
            return false;
        return true;
    }
}
