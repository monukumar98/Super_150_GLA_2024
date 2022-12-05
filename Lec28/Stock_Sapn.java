package Lec28;

import java.util.Stack;

public class Stock_Sapn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 2, 1, 3, 5, 4, 7, 8, 19 };

	}

	public static void CalSpan(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			if (!st.isEmpty()) {
				ans[i] = i - st.peek();
			} else {
				ans[i] = i + 1;
			}

			st.push(i);

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}
