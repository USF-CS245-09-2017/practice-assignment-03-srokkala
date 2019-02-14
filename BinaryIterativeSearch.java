package hw2;

public class BinaryIterativeSearch implements Practice03Search {

	@Override
	public String searchName() 
	{
		// TODO Auto-generated method stub
		return "Binary Iterative";
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0;					
		int end = arr.length-1;				
		while(start <= end)
		{
			int mid = (start + end)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(target > mid)
			{
				start = mid +1;
			}
			else if( target < mid)
			{
				end = mid -1;
			}
		}
		return -1;
	}

}
