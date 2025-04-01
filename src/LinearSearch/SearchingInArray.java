package LinearSearch;

import java.util.Scanner;
public class SearchingInArray {

	static public boolean find(int[] arr, int target, int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			if(arr[i]==target)
				return true;
		}
		return false;
		
	}
	static public int maxValue(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	static public int minValue(int[] arr)
	{
		int min = arr[0];
		for(int i:arr)
		{
			if(i<min)
				min = i;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {15,45,0,-1,98,65,6,1,-23};
		System.out.print("Enter element to find in Array :");
		System.out.println(find(arr, sc.nextInt(), 1, arr.length-1));
		System.out.println("Maximum Value in Array :"+maxValue(arr));
		System.out.println("Minimum Value in Array :"+minValue(arr));
		
	}
}
