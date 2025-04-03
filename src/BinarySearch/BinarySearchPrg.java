package BinarySearch;

import java.util.Arrays;

public class BinarySearchPrg {

	static public int search(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		int mid;
		while(start<=end)
		{
			mid = start + (end - start)/2;
			if(arr[mid] == target)
				return mid;
			else if(target < arr[mid])
				end = mid-1;
			else if(target > arr[mid])
				start = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {14,15,16,17,18,19,20};
		int index = search(arr, 14);
		System.out.println(Arrays.toString(arr));
		System.out.println(index);
	}
}
