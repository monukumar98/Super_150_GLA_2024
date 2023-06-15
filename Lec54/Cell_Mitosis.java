package Lec54;

import java.util.Scanner;

public class Cell_Mitosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(mincost( x, y, z, n));

	}

	public static long mincost(int x, int y, int z, int n) {
		long[] dp = new long[n + 1];
		for (int i = 2; i < dp.length; i++) {
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2] + x, dp[i - 1] + y);
			} else {
				dp[i] = Math.min(dp[(i + 1) / 2] + x + z, dp[i - 1] + y);

			}

		}
		return dp[n];

	}

}
