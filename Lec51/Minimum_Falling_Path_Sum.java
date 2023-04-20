package Lec51;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(arr, 0, i));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] arr, int i, int j) {
		if (j < 0 || j >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		int a = Falling_Path_Sum(arr, i + 1, j - 1);
		int b = Falling_Path_Sum(arr, i + 1, j);
		int c = Falling_Path_Sum(arr, i + 1, j + 1);
		return arr[i][j] + Math.min(a, Math.min(b, c));

	}

}
