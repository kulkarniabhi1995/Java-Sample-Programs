public class SelectionSort
{
	public static void SortwithSelectionSort(int[] inputArray ,int inputArrayLength)
	{
			for(int i = 0; i < inputArrayLength - 1; i++)
			{
				int minIndex=i;
				for(int j = i+1; j < inputArrayLength; j++)
				{
					if(inputArray[j] < inputArray[minIndex])
					{
						minIndex = j;
					}	
						
					int temp = inputArray[minIndex];
					inputArray[minIndex] = inputArray[i];
					inputArray[i] = temp;				
				}
			}			
	}
	
    public static void main(String[] args)
    {
        int[] arrayToSort= { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arrayLength= arrayToSort.length;
        SortwithSelectionSort(arrayToSort, arrayLength);
		for(int arrayValue : arrayToSort)
		{
			System.out.println(arrayValue);
		}
    }
}