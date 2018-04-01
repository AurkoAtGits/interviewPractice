package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given any integer, print an English phrase that describes the integer.
 * Example: "One Thousand, Two Hundred Thirty Four."
 */
public class IntegerInWordsQuestion
{
    HashMap<Integer, String> wordMap = new HashMap<>();
    HashMap<Integer, String> tensMap = new HashMap<>();
    HashMap<Integer, String> unitsMap = new HashMap<>();
    //create a map with number and meaning
    //keep dividing by 10 till we get zero
    //append to string buffer everytime in the loop
    public String convertNumberToString(int number)
    {
        createIntegerToWordMap();
        createTensMap();
        ArrayList<String> numtowordList = new ArrayList<>();
        int unitCount = 0;
        while(number > 0)
        {
            int remainder = number%10;
            numtowordList.add(getWord(remainder, ++unitCount));
            number = number/10;
        }
        return getFinalString(numtowordList);
    }

    private String getWord(int remainder, int count)
    {
        String word;
        switch(count){
            case 1:
                word = wordMap.get(remainder);
                break;
            case 2:
                word = tensMap.get(remainder) + " ";
                break;
            case 3:
                word = wordMap.get(remainder) + " Hundred ";
                break;
            case 4:
                word = wordMap.get(remainder) + " Thousand ";
                break;
            default:
                word = "error";
                break;
        }
        return word;
    }

    private HashMap<Integer, String> createIntegerToWordMap()
    {
        wordMap.put(1, "One");
        wordMap.put(2, "Two");
        wordMap.put(3, "Three");
        wordMap.put(4, "Four");
        wordMap.put(5, "Five");
        wordMap.put(6, "Six");
        wordMap.put(7, "Seven");
        wordMap.put(8, "Eight");
        wordMap.put(9, "Nine");
        wordMap.put(10, "Ten");
        return wordMap;
    }

    private HashMap<Integer, String> createTensMap()
    {
        tensMap.put(2, "Twenty");
        tensMap.put(3, "Thirty");
        tensMap.put(4, "Forty");
        tensMap.put(5, "Fifty");
        tensMap.put(6, "Sixty");
        tensMap.put(7, "Seventy");
        tensMap.put(8, "Eighty");
        tensMap.put(9, "Ninty");
        return tensMap;
    }

    private HashMap<Integer, String> createUnitsMap()
    {
        unitsMap.put(3, "Hundred");
        unitsMap.put(3, "Thousand");
        unitsMap.put(3, "Ten Thousand");
        return unitsMap;
    }

    private String getFinalString(ArrayList<String> numToWordList)
    {
        String finalString= "";
        for(int count = numToWordList.size()-1; count>=0; count --)
        {
            finalString += numToWordList.get(count);
        }
        return finalString;
    }
}
