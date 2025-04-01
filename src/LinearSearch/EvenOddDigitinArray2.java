package LinearSearch;

public class EvenOddDigitinArray2 {

	public static int digit(int num)
	{
		if(num<0)
			num = num*-1;
		if(num==0)
			return 1;
		/*
			int count =0;
			while(num>0)
			{
				count++;
				num = num/10;
			}
			return count;
		*/
		return (int)(Math.log10(num))+1;
		
	}
	
	public static boolean even(int num) 
	{
		int digitOddEven = digit(num); 
		return digitOddEven %2==0;
	}
	
	public static int findNumbers(int[] arr)
	{
		int count=0;
		for(int num:arr)
		{
			if(even(num))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {54,9,-41,9,0,3,649,21654,2260};
		System.out.println(findNumbers(arr));
	}
}
