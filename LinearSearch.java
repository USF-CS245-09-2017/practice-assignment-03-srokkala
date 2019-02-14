package hw2;

public class LinearSearch implements Practice03Search
{

	@Override
	public String searchName() 
	{
		// TODO Auto-generated method stub
		return "Linear Search";
	}

	@Override
	public int search(int[] arr, int target) 
	{
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length;i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		
		return -1;
	}

}
