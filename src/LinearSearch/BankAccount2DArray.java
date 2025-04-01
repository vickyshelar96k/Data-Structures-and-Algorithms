package LinearSearch;

import java.util.Arrays;
public class BankAccount2DArray {

	public String calculator(int[][] arr)
	{
		int wealth = 0, customer=0;
		int sum;
		for(int i=0; i<arr.length; i++)
		{
			sum=0;
			for(int j=0; j<arr[i].length;j++)
			{
				sum = sum + arr[i][j];
			}
			if(wealth<sum) {
				wealth = sum;
				customer = i;
			}
		}
		return "Customer :"+(customer+1)+" Wealth :"+wealth;
	}
	public static void main(String[] args) {
		int[][] accounts = {
				{1,2},
				{7,3},
				{8,7},
				{4,2}
		};
		for(int[] i:accounts)
		{
			System.out.println(Arrays.toString(i));
		}
		BankAccount2DArray bd = new BankAccount2DArray();
		System.out.println(bd.calculator(accounts));
	}
}
