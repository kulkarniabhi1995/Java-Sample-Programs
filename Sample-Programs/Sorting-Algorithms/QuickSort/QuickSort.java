public class QuickSort
{
	public static void SortwithQuickSort(int[] inputArray , int low, int high)
	{
		if(low < high)
		{
			int partitionIndex= Partition(inputArray, low , high);
			SortwithQuickSort(inputArray,low,partitionIndex-1);
			SortwithQuickSort(inputArray,partitionIndex+1,high);
		}
	}
	
	public static int Partition(int[] inputArray , int low, int high)
	{
		int pivot = inputArray[high];
		int i = low-1;			
		for(int j = low; j < high;j++)
		{
			if(inputArray[j] < pivot)
			{
				i++;
				int temp= inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
			}
		}
		
		int temp= inputArray[i+1];
		inputArray[i+1]=inputArray[high];
		inputArray[high]=temp;
		
		return i+1;		
	}
	
    public static void main(String[] args)
    {
        int[] arrayToSort= { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arrayLength= arrayToSort.length;
		int low=0;
		int high=arrayLength-1;
        SortwithQuickSort(arrayToSort, low, high);
		for(int arrayValue : arrayToSort)
		{
			System.out.println(arrayValue);
		}
    }
}