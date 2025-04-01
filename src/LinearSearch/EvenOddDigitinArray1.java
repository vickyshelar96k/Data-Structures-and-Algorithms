package LinearSearch;

import java.util.Arrays;
public class EvenOddDigitinArray1 {

	//for finding the digits in a Number
	static public int digit(int num)
	{
		if(num<0)
			num = num *(-1);
		
		if(num == 0)
			return 1;
		
		int count =0;
		while(num>0)
		{
			count++;
			num = num /10;
		}
		return count;
	}
	
	//Checking even number of digits
	static public boolean even(int num)
	{
		int numberOfDigits = digit(num);
		return numberOfDigits % 2 ==0;
	}
	
	static public int findNumbers(int[] arr)
	{
		int count = 0;
		for(int num: arr)
		{
			if(even(num))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {51,8,9146,982,1,0,-73,34,-9436};
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of Even digits Holdes :"+findNumbers(arr));
	}
}
