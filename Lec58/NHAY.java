package Lec58;

import java.util.Arrays;
import java.util.Scanner;

public class NHAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			String pat = sc.next();
			String text = sc.next();
			lps(text, pat);
		}

	}

	public static void lps(String text, String pat) {
		String str = pat + "#" + text;
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
		// System.out.println(Arrays.toString(dp));
		for (int i = pat.length(); i < dp.length; i++) {
			if (dp[i] == pat.length()) {
				System.out.println(i - 2 * pat.length());
			}

		}

	}

}
