package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Concatination {

	public static int[] concateArray(int[] nums, int n)
	{
		int[] ans = new int[2*n];
		for(int i=0; i<n ;i++)
		{
			ans[i] = nums[i];
			ans[n+i] = nums[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter array elements :");
		for(int i=0; i<size; i++)
			nums[i] = sc.nextInt();
		System.out.println(Arrays.toString(nums));
		nums = concateArray(nums, size);
		System.out.println(Arrays.toString(nums));
	}
	
}
