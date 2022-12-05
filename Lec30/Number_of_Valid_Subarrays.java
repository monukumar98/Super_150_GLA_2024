package Lec30;

import java.util.Stack;

public class Number_of_Valid_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(ValidSubArray(arr));
	}

	public static int ValidSubArray(int[] arr) {

		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < st.peek()) {
				st.pop();
			}
			st.push(arr[i]);
			ans += st.size();
		}
		return ans;

	}

}
