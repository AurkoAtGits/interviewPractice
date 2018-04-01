package main.java;

public class FactorialTrailingZerosQuestion
{
    private double factorial = 1;
    public double calculateFactorial(int number)
    {
        for(int count = number; count > 0; count --)
        {
            factorial = factorial * count;
        }
        return factorial;
    }
}
