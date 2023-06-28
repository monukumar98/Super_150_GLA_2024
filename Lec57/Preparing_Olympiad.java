package Lec57;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int l = 5;
		int r = 6;
		int x = 1;
		int[] arr = { 1, 2, 3 };
		System.out.println(countcontest(arr, l, r, x));

	}

	public static int countcontest(int[] arr, int l, int r, int x) {
		int n = arr.length;
		int ans = 0;
		for (int i = 3; i < (1 << n); i++) {
			if (countsetbit(i) >= 2) {
				if (isitpossible(arr, l, r, x, i)) {
					ans++;
				}
			}

		}
		return ans;
	}

	private static boolean isitpossible(int[] arr, int l, int r, int x, int i) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				sum += arr[pos];
				min = Math.min(min, arr[pos]);
				max = Math.max(max, arr[pos]);
			}
			i >>= 1;
			pos++;
		}
		return sum >= l & sum <= r & (max - min) >= x;
	}

	public static int countsetbit(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;
		}
		return count;
	}

}
