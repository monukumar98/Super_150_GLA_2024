package Lec61;

import java.util.*;

public class Two_Arrays_and_Sum_of_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		int mod = 998244353;
		for (int i = 0; i < a.length; i++) {
			long x = sc.nextLong();
			a[i] = (x * (i + 1) * (n - i));

		}
		Long[] b = new Long[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextLong();
		}

		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		for (int i = 0; i < b.length; i++) {
			ans = ans + ((a[i] % mod) * b[i]);
			ans %= mod;
		}
		System.out.println(ans);
	}

}
