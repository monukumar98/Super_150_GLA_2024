package Lec28;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		revsere(st);
		System.out.println(st);
	}

	private static void revsere(Stack<Integer> st) {
		// TODO Auto-generated method stub

		if (st.isEmpty()) {
			return;
		}

		int x = st.pop();
		revsere(st);

		Insert(st, x);

	}

	public static void Insert(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int ii = st.pop();
		Insert(st, item);
		st.push(ii);

	}

}
