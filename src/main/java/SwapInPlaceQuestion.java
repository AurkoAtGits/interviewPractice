package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapInPlaceQuestion
{
    public ArrayList<Integer> swapInPlace(ArrayList<Integer> twoNumbersList)
    {
        int number1 = twoNumbersList.get(0);
        int number2 = twoNumbersList.get(1);
        number1 = number1+number2;
        number2 = number1-number2;
        number1 = number1-number2;
        return (new ArrayList<Integer>(Arrays.asList(number1,number2)));
    }
}
