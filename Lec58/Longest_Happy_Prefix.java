package Lec58;

public class Longest_Happy_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababab";
		System.out.println(lps(str));

	}

	public static String lps(String str) {
		int[] dp = new int[str.length()];
		int len = 0;
		for (int i = 1; i < dp.length;) {
			if (str.charAt(len) == str.charAt(i)) {
				len++;
				dp[i] = len;
				i++;
			} else {
				if (len > 0) {
					len = dp[len - 1];
				} else {
					dp[i] = 0;
					i++;
				}

			}

		}
		return str.substring(0, dp[str.length() - 1]);

	}
}
