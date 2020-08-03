public class BubbleSort
{
	boolean sorted; 
	public static void SortwithBubbleSort(int[] inputArray ,int inputArrayLength)
	{
		boolean sorted=false;
			for(int i=0; i < inputArrayLength - 1; i++)
			{
				for(int j=0; j < inputArrayLength - i - 1; j++)
				{
					if(inputArray[j]> inputArray[j+1])
					{
						int temp=inputArray[j];
						inputArray[j]=inputArray[j+1];
						inputArray[j+1]=temp;
						sorted = true; 
					}
				}
				if (sorted == false) 
                break; 
			}			
	}
	
    public static void main(String[] args)
    {
        int[] arrayToSort= { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arrayLength= arrayToSort.length;
        SortwithBubbleSort(arrayToSort, arrayLength);
		for(int arrayValue : arrayToSort)
		{
			System.out.println(arrayValue);
		}
    }
}