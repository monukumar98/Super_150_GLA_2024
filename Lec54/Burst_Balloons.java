package Lec54;

public class Burst_Balloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 5, 8 };
		int[] arr = new int[nums.length + 2];
		arr[0] = arr[arr.length - 1] = 1;
		for (int i = 1; i < arr.length - 1; i++) {
			arr[i] = nums[i - 1];
		}
		System.out.println(Burst(arr, 0, arr.length - 1));

	}

	public static int Burst(int[] arr, int si, int ei) {
		if (si + 1 == ei) {
			return 0;
		}
		int ans = Integer.MIN_VALUE;
		for (int k = si + 1; k < ei; k++) {
			int left = Burst(arr, si, k);
			int right = Burst(arr, k, ei);
			int self = arr[si] * arr[k] * arr[ei];
			ans = Math.max(ans, self + left + right);

		}
		return ans;

	}

	public static int Burst(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];
		for (int slide = 2; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int ans = Integer.MIN_VALUE;
				for (int k = i + 1; k < j; k++) {
					int left = dp[i][k];
					int right = dp[k][j];
					int self = arr[i] * arr[k] * arr[j];
					ans = Math.max(ans, self + left + right);

				}
				dp[i][j] = ans;
			}

		}
		return dp[0][dp.length - 1];

	}

}
