
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] A) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if(sum < 0) 
				sum = A[i];
			else 
				sum += A[i];
			if(sum > max) 
				max = sum;
		}
		return sum;
	}


}
