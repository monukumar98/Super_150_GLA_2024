package Lec53;

import java.util.Arrays;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };
		// M1 = 4*2
		// M2 = 2*3
		// M3 = 3*5
		// M4 = 5*1
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(Mcm(arr, 0, arr.length - 1, dp));
		System.out.println(McmBU(arr));

	}

	public static int Mcm(int[] arr, int i, int j, int[][] dp) {

		if (i + 1 == j) {
			return 0;
		}
		// dp Apply
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for (int k = i + 1; k < j; k++) {
			int fs = Mcm(arr, i, k, dp);// m1--ek Martix
			int ss = Mcm(arr, k, j, dp);// ( m2m3m4 )--> ek Matrix milega
			int self = arr[i] * arr[k] * arr[j];
			ans = Math.min(ans, fs + ss + self);

		}
		return dp[i][j] = ans;

	}

	public static int McmBU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];

		for (int slide = 2; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int ans = Integer.MAX_VALUE;
				for (int k = i + 1; k < j; k++) {
					int fs = dp[i][k];// m1--ek Martix
					int ss = dp[k][j];// ( m2m3m4 )--> ek Matrix milega
					int self = arr[i] * arr[k] * arr[j];
					ans = Math.min(ans, fs + ss + self);

				}
				dp[i][j] = ans;

			}

		}
		return dp[0][arr.length - 1];

	}

}
