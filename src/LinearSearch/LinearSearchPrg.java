package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchPrg {

	static public int find(int[] arr, int target)
	{
		if(arr.length==0)
			return -1;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==target)
				return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter Array Elements :");
		for(int i=0; i<arr.length;i++)
			arr[i] = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to find :");
		System.out.println(find(arr, sc.nextInt()));
	}
}
