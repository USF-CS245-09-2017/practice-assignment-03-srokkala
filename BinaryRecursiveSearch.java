package hw2;

public class BinaryRecursiveSearch implements Practice03Search 
{

	@Override
	public String searchName() 
	{
		// TODO Auto-generated method stub
			return "Binary Recursive";
	}

	@Override
	
	
	
	public int search(int[] arr, int target) 
	{
		 return search(arr, target, 0, arr.length-1);			//passes the parameters which set the start to 0 and end to array-1  as parameters
	}
	
	
  
    public int search(int[] arr, int target, int start, int end) 
    {
    	int mid = (start + end) / 2;

		if (start > end) 				//makes sure the array is in order before executing
		{
			return -1;
		}
            
		if (arr[mid] == target) 		//if target is found at mid, return mid
		{
			return mid;
		} 
		
		else if (target > arr[mid]) 		// otherwise check if target is great than mid, if true, target has to be in the right sub array
		{
			return search(arr, target, mid + 1, end);
		}
		
		
													//if not found in middle or if it's not bigger than mid, it must be on the left so the end changes to mid -1
		return search(arr, target, start, mid - 1);

  
    }

}
