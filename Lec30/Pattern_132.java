package Lec30;

import java.util.Stack;

public class Pattern_132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 4, 2 };
		System.out.println(Pattern132(arr));
	}

	public static boolean Pattern132(int[] arr) {
		int[] min = new int[arr.length];
		min[0] = arr[0];
		for (int i = 1; i < min.length; i++) {
			min[i] = Math.min(min[i - 1], arr[i]);
		}
		Stack<Integer> st = new Stack<>();
		for (int j = arr.length - 1; j >= 0; j--) {
			int ith = min[j];
			while (!st.isEmpty() && ith >= arr[st.peek()]) {
				st.pop();
			}
			if (!st.isEmpty() && arr[j] > arr[st.peek()]) {
				return true;
			}
			st.push(j);
		}
		return false;

	}

}
