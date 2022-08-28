package Lec6;

public class Reversal_Ago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		RotateArray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void RotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		k = k % n;
		// last element
		Range_reverse(arr, n - k, n - 1);
		// 1st n-k element
		Range_reverse(arr, 0, n - k - 1);

		// 0 to n-1 element
		Range_reverse(arr, 0, n - 1);

	}

	public static void Range_reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
