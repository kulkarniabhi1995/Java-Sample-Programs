public class InsertionSort
{
	public static void SortwithInsertionSort(int[] inputArray ,int inputArrayLength)
	{
			for(int i = 1; i < inputArrayLength; ++i)
			{		
				int key=inputArray[i];
				int j=i-1;
				while( j>=0 && inputArray[j] > key )
				{
					inputArray[j+1]=inputArray[j];					
					j=j-1;							
				}
				inputArray[j+1]=key;
			}
	}			
	
    public static void main(String[] args)
    {
        int[] arrayToSort= { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arrayLength= arrayToSort.length;
        SortwithInsertionSort(arrayToSort, arrayLength);
		for(int arrayValue : arrayToSort)
		{
			System.out.println(arrayValue);
		}
    }
}