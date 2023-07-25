package Lec63;

public class Rock_and_Lever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 7, 10 };
		System.out.println(CountPair(arr));

	}

	public static long CountPair(int[] arr) {
		boolean[] visited = new boolean[arr.length];
		long ans = 0;
		for (int i = 31; i >= 0; i--) {
			long c = 0;
			for (int j = 0; j < arr.length; j++) {
				if ((arr[j] & (1 << i)) != 0 && !visited[j]) {
					c++;
					visited[j] = true;
				}

			}
			ans = ans + (c * (c - 1)) / 2;

		}
		return ans;
	}

}
