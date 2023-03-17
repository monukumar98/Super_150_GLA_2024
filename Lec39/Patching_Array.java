package Lec39;

public class Patching_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 10 };
		int n = 33;
		System.out.println(minPatches(arr, n));
	}

	public static int minPatches(int[] nums, int n) {
		long missing = 1;
		int count = 0;
		int i = 0;
		while (missing <= n) {
			if (i < nums.length && missing >= nums[i]) {
				missing += nums[i];
				i++;
			} else {
				count++;
				missing += missing;
			}

		}
		return count;

	}
}


