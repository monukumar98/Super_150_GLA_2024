package Lec6;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 4, 1, 7 };
		int item = -4;
		System.out.println(search(arr, item));

	}

	public static int search(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;

	}
}
