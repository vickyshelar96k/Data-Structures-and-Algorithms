package BinarySearch;

public class FloorNumber {

	//FloorNumber - biggest number smaller that equal to target
	public static int searchFloor(int[] arr,int target)
	{
		if(target < arr[0])
			return -1;
		int start =0, end = arr.length-1;
		int mid;
		while(start<=end)
		{
			mid = start + (end-start)/2;
			if(target == arr[mid])
				return arr[mid];
			else if(target < arr[mid])
				end = mid-1;
			else 
				start = mid+1;
		}
		return arr[end];
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,7,9,11,13,19,23,29,31};
		int target = -3;
		System.out.println("Floor of "+target+" :"+searchFloor(arr, target));
	}
}
