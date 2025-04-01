package LinearSearch;

import java.util.Scanner;
public class Searching2DArray {

	public static boolean find(int[][] arr,int target)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{87,91,6},
				{6,10,7}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to find in Matrix :");
		System.out.println(find(arr,sc.nextInt()));
	}
}
