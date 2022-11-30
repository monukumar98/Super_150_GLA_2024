package Lec29;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
		int[] ans = new int[matrix[0].length];
		int area = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 1) {
					ans[j]++;
				} else {
					ans[j] = 0;
				}

			}
			area = Math.max(area, Area(ans));

		}
		System.out.println(area);

	}

	public static int Area(int[] arr) {

		Stack<Integer> st = new Stack<>();
		int maxarea = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					maxarea = Math.max(maxarea, h * r);
				} else {
					int l = st.peek();
					maxarea = Math.max(maxarea, h * (r - l - 1));
				}
			}

			st.push(i);
		}
		int r = arr.length;

		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (st.isEmpty()) {
				maxarea = Math.max(maxarea, h * r);
			} else {
				int l = st.peek();
				maxarea = Math.max(maxarea, h * (r - l - 1));
			}
		}
		return maxarea;

	}

}
