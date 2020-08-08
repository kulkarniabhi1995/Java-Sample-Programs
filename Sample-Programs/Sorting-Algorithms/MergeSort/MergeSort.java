public class MergeSort
{
	public static void Merge(int[] inputArray , int left, int mid, int right)
	{
			int n1 = mid + 1 - left;
			int n2 = right - mid;
			
			int[] leftArray = new int[n1];
			int[] rightArray = new int[n2];
			
			for(int i = 0; i < n1; i++)
				leftArray[i]=inputArray[left + i];
			for(int i = 0; i < n2; i++)
				rightArray[i]=inputArray[mid + 1 + i];
			
			int i=0, j=0;
			int k=left;
			while(i < n1 && j < n2)
			{
				if(leftArray[i] < rightArray[j])
				{
					inputArray[k++]=leftArray[i++];
				}
				else
				{
					inputArray[k++]=rightArray[j++];
				}
				
			}
			
			while(i < n1)
			{		
				inputArray[k++] = leftArray[i++];
			}
			
			while(j < n2)	
			{
				inputArray[k++] = rightArray[j++];
			}
			
	}
	
	public static void SortwithMergeSort(int[] inputArray , int left, int right)
	{
		if(left < right)
        {
            int mid = (left + right)/2;
            SortwithMergeSort(inputArray, left, mid);
            SortwithMergeSort(inputArray, mid + 1, right);
            Merge(inputArray, left, mid, right);
        }	
	}
	
    public static void main(String[] args)
    {
        int[] arrayToSort= { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arrayLength= arrayToSort.length;
		int low=0;
		int high=arrayLength-1;
        SortwithMergeSort(arrayToSort, low, high);
		for(int arrayValue : arrayToSort)
		{
			System.out.println(arrayValue);
		}
    }
}