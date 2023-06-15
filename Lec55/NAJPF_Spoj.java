package Lec55;

import java.util.ArrayList;
import java.util.Scanner;

public class NAJPF_Spoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String s = sc.next();
			String t = sc.next();

			RabinKarp(s, t);

		}

	}

	public static void RabinKarp(String s, String t) {
		long mod = 1000_000_007;
		long pow = 1;
		long hv = 0;
		int pr = 31;
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			hv = (hv + ((ch - 'a' + 1) * pow) % mod) % mod;
			hv = (hv + mod) % mod;
			pow = (pow * pr) % mod;
		}
		// rabin karp
		long[] dp = new long[s.length()];
		long[] pa = new long[s.length()];
		dp[0] = s.charAt(0) - 'a' + 1;
		pa[0] = 1;
		pow = pr;
		for (int i = 1; i < pa.length; i++) {
			char ch = s.charAt(i);
			dp[i] = (dp[i - 1] + ((ch - 'a' + 1) * pow % mod + mod) % mod) % mod;
			pa[i] = pow;
			pow = (pow * pr) % mod;

		}
		ArrayList<Integer> ll = new ArrayList<>();
//		if (dp[t.length() - 1] == hv) {
//			ll.add(1);
//		}
		for (int ei = t.length() - 1, si = 0; ei < pa.length; ei++, si++) {

			if (si == 0) {
				if (dp[t.length() - 1] == hv) {
					ll.add(1);
				}
			} else {
				long hvalue = (dp[ei] - dp[si - 1] + mod) % mod;

				if (hvalue == hv * pa[si] % mod) {
					ll.add(si + 1);

				}
			}

		}
		if (ll.size() == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println(ll.size());
			for (int val : ll) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		

	}

}
