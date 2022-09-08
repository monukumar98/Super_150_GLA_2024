package Lec8;

public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 47;
		System.out.println(root(n));

	}

	public static int root(int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (mid * mid <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

}
