package Lec12;

public class Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 3, 5, 2, 3 };
		int k = 10;
		System.out.println(NoofSubArray(arr, k));

	}

	public static int NoofSubArray(int[] arr, int k) {

		int ans = 0;
		int si = 0;
		int ei = 0;
		int p = 1;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];

			// window shrink kro
			while (p >= k && si<=ei) {
				p = p / arr[si];
				si++;
			}

			// ans cal
			ans = ans + ei - si + 1;
			ei++;

		}
		return ans;

	}

}
