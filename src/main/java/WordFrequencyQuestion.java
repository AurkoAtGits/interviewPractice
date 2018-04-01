package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Design a method to find the frequency of occurrences of any given word in a book.
 * What if we were running this algorithm multiple times.
 */
public class WordFrequencyQuestion
{
    private HashMap<String, Integer> wordFrequency = new HashMap<>();

    public WordFrequencyQuestion(String book)
    {
        for(String word : getWordList(book))
        {
            if(wordFrequency.containsKey(word))
            {
                int count = wordFrequency.get(word);
                wordFrequency.put(word, ++count);
            }else
                wordFrequency.put(word , 1);
        }
    }

    public int getWordFrequency(String word)
    {
        word = word.toLowerCase();
        if(wordFrequency.containsKey(word))
            return wordFrequency.get(word);
        return 0;
    }

    private ArrayList<String> getWordList(String book)
    {
        String lowerCaseBookString = book.toLowerCase();
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(lowerCaseBookString.split(" ")));
        return sanitizeWordList(wordList);
    }

    private ArrayList<String> sanitizeWordList(ArrayList<String> wordsList)
    {
        ArrayList<String> sanitizedWordList = new ArrayList<>();
        for(String word : wordsList)
        {
            if(word.length() > 1)
            {
                String lastChar = word.substring(word.length()-1, word.length());
                if(lastChar.equals(".") || lastChar.equals("!"))
                    sanitizedWordList.add(word.substring(0,word.length()-1));
                else
                    sanitizedWordList.add(word);
            }
            else
                sanitizedWordList.add(word);
        }
        return sanitizedWordList;
    }

}
