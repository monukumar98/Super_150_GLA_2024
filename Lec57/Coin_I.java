package Lec57;

import java.util.Arrays;

public class Coin_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] p = { 0.30, 0.60, 0.80 };
		int n = p.length;
		double[][] dp = new double[(n + 4) / 2][n];
		for (double[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Answer(p, 0, (n + 1) / 2, dp));

	}

	public static double Answer(double[] p, int i, int h, double[][] dp) {
		if (h == 0) {
			return 1;

		}
		if (i == p.length) {
			return 0;
		}
		if (dp[h][i] != -1) {
			return dp[h][i];
		}

		double ans = p[i] * Answer(p, i + 1, h - 1, dp) + (1 - p[i]) * Answer(p, i + 1, h, dp);
		return dp[h][i] = ans;
	}

}
