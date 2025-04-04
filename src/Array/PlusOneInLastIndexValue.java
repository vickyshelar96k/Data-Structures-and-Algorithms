package Array;

import java.util.Arrays;

public class PlusOneInLastIndexValue {
	static public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
	
	public static void main(String[] args) {
		int[] digits = {4,3,2,2};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
}
