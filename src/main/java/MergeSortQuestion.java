package main.java;

public class MergeSortQuestion
{
    private int[] inputArray;
    private int[] helper;

    public int[] mergeSortImpl(int inputArray[])
    {
        this.inputArray = inputArray;
        helper = new int[inputArray.length];
        mergeSort(0, inputArray.length -1);
        return this.inputArray;
    }

    private void mergeSort(int left, int right)
    {
        if(left < right)
        {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    private void merge(int left, int middle, int right)
    {
        int finalArrayPos = left;

        for(int i=0; i<=right; i++)
        {
            helper[i] = inputArray[i];
        }

        int low = left;
        int high = middle + 1;
        while(low <= middle && high <= right)
        {
            if(helper[low] <= helper[high])
                inputArray[finalArrayPos++] = helper[low++];
            else
                inputArray[finalArrayPos++] = helper[high++];
        }

        for(int i=low; i<=middle; i++)
        {
            inputArray[finalArrayPos++] = helper[i];
        }
    }
}
