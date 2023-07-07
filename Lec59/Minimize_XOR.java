package Lec59;

public class Minimize_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1 = 3;
		int nums2 = 5;
		System.out.println(XOR(nums1, nums2));
	}

	public static int XOR(int nums1, int num2) {
		int count = SetBit(num2);
		int ans = 0;
		for (int i = 31; i >= 0 && count > 0; i--) {
			if ((nums1 & (1 << i)) != 0) {
				ans += (1 << i);
				count--;
			}
		}
		for (int i = 0; i <= 31 && count > 0; i++) {
			if ((nums1 & (1 << i)) == 0) {
				ans += (1 << i);
				count--;
			}
		}
		return ans;

	}

	public static int SetBit(int num2) {
		int count = 0;
		while (num2 > 0) {
			count++;
			num2 = (num2 & (num2 - 1));
		}
		return count;
	}

}
