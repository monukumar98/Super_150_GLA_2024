package Lec51;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(arr, 0, i));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] arr, int i, int j) {
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < arr[0].length; col++) {
			if (col != j) {
				ans = Math.min(ans, Falling_Path_Sum(arr, i + 1, col));
			}
		}
		return ans + arr[i][j];

	}

}
