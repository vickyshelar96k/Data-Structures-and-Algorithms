package BinarySearch;

public class CeilingNumber {
	
	//Ceiling Number - smallest number greater than equal to target
	public static int searchCeiling(int[] arr, int target)
	{
		int start=0, end=arr.length-1;
		int mid;
		while(start<=end)
		{
			//Edge Case if(number is larger than array element)
			if(target > arr[arr.length-1])
			{
				return -1;
			}
			
			mid = start + (end-start)/2;
			if(target == arr[mid])
				return arr[mid];
			else if(target < arr[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		return arr[start];
	}
	
	public static void main(String[] args)
	{
		int [] arr = {2,3,5,7,9,13,17,23,29,31};
		int target = 36;
		System.out.println("Ceiling of "+target+" is :"+searchCeiling(arr, target));
	}
}
