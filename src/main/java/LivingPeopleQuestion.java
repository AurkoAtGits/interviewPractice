package main.java;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given a list of people with their birth and death years,Implement a method to compute
 * the year with most number of people alive. You may assume that all people were born between 1900
 * and 2000 (inclusive). If a person is alive during any portion of that year, They should be included in that year's count.
 * Example: Person(birth =1908, death=1909) is included in the counts for both 1908 and 1909.
 */
public class LivingPeopleQuestion
{
    HashMap<Integer, Integer> yearHashMap = new HashMap<>();
    int maxCount = 0;
    public int getMaxAliveYear (ArrayList<int[]> personYearList)
    {
        int finalYear = 0;

        for (int[] yearPair : personYearList)
        {
           int year = populateYearHashMap(yearPair[0], yearPair[1]);
            if(year > 0)
                finalYear = year;
        }
        return finalYear;
    }

    private int populateYearHashMap (int birthYear, int deathYear)
    {
        int finalYear = 0;
        for (int year = birthYear; year <= deathYear; year++)
        {
            if (!yearHashMap.containsKey(year))
                yearHashMap.put(year, 1);
            else
            {
                int count = yearHashMap.get(year);
                if (count > maxCount)
                {
                    maxCount = count;
                    finalYear = year;
                }
                yearHashMap.put(year, count++);
            }
        }
        return finalYear;
    }
}