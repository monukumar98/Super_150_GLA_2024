package Lec22;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 7, 9, 11 };

		int[] arr2 = { 1, 2, 3, 4, 6, 7 };
		int[] ans = MergeTwoArray(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] MergeTwoArray(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
