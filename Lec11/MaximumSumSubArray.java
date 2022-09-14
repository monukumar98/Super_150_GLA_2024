package Lec11;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -7, 4, 6 };
		System.out.println(maxsum(arr));

	}

	public static int maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(ans, sum);
			}

		}
		return ans;
	}

	public static int kadensAlgo(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
