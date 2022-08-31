package Lec7;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 8, 9, 3, 5, 4, 2, 1 };
		NextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void NextPermutation(int[] arr) {

		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}

		if (p == 0 && q == 0) {
			Range_reverse(arr, 0, arr.length - 1);
			return;
		}
		// Swap p and q index
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Range_reverse(arr, p + 1, arr.length - 1);

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
