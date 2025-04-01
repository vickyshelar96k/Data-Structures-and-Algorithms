package LinearSearch;

import java.util.Arrays;

public class EvenOddDigitinArray {

	public static int evenOddDigit(int[] arr)
	{
		int evenodd = 0;
		int count;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
				arr[i]= arr[i]*(-1);
			
			int num = arr[i];
			count=0;
			while(num>0)
			{
				count++;
				num = num / 10;
			}
			if(count!=0 && count%2==0)
			{
				evenodd++;
			}
		}
		return evenodd;
	}
	public static void main(String[] args) {
		int[] arr = {53,0,6,30,-64,9794,6078};
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of Even Digit Holders :"+evenOddDigit(arr));
	}
}
