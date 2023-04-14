package Lec50;

import java.util.Arrays;

public class Max_Dot_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -1, -1 };
		int[] arr2 = { 1, 1 };
		int[][] dp = new int[arr1.length][arr2.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000_000_00);
		}
		System.out.println(Product(arr1, arr2, 0, 0, true, dp));
	}

	public static int Product(int[] arr1, int[] arr2, int i, int j, boolean flag, int[][] dp) {
		if (i == arr1.length || j == arr2.length) {
			if (flag)
				return 0;
			else {
				return -10000000;
			}
		}
		if (dp[i][j] != -1000_000_00) {
			return dp[i][j];
		}

		int dot = arr1[i] * arr2[j] + Product(arr1, arr2, i + 1, j + 1, true, dp);// dp[i-1][j-1]
		int fd = Product(arr1, arr2, i + 1, j, false, dp);// dp[i-1][j]
		int sd = Product(arr1, arr2, i, j + 1, false, dp);// dp[i][j-1]
		return dp[i][j] = Math.max(arr1[i] * arr2[j], Math.max(fd, Math.max(dot, sd)));

	}

	public static int Product(int[] arr1, int[] arr2) {
		int[][] dp = new int[arr1.length + 1][arr2.length + 1];
		int sp = Integer.MIN_VALUE;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int dot = arr1[i - 1] * arr2[j - 1] + dp[i - 1][j - 1];
				int fd = dp[i - 1][j];
				int sd = dp[i][j - 1];
				
				dp[i][j] = Math.max(arr1[i - 1] * arr2[j - 1], Math.max(fd, Math.max(dot, sd)));
				sp = Math.max(sp, arr1[i - 1] * arr2[j - 1]);
			}
		}
		if (dp[dp.length - 1][dp[0].length - 1] == 0) {
			return sp;
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
