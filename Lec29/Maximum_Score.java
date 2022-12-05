package Lec29;

import java.util.Stack;

public class Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 7, 4, 5 };
		int k = 3;
		System.out.println(Area(arr, k));

	}

	public static int Area(int[] arr, int k) {

		Stack<Integer> st = new Stack<>();
		int maxarea = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (r - 1 >= k) {
					if (st.isEmpty()) {
						maxarea = Math.max(maxarea, h * r);
					} else {
						int l = st.peek();
						if (l + 1 <= k) {
							maxarea = Math.max(maxarea, h * (r - l - 1));
						}
					}

				}
			}

			st.push(i);
		}
		int r = arr.length;

		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (r - 1 >= k) {
				if (st.isEmpty()) {
					maxarea = Math.max(maxarea, h * r);
				} else {
					int l = st.peek();
					if (l + 1 <= k) {
						maxarea = Math.max(maxarea, h * (r - l - 1));
					}
				}
			}

		}
		return maxarea;

	}
}
