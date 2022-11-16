package Lec26;

public class Stack {
	private int[] arr;
	private int top;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		top = -1;
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		top = -1;
	}

	public boolean isEmpty() {

		return top == -1;

	}

	public boolean isfull() {

		return top == arr.length - 1;

	}

	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("BkLol Stack full hai");
		}
		top++;
		arr[top] = item;

		
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("BkLol Stack khali hai");
		}
		int rv = arr[top];
		top--;
		return rv;
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("BkLol Stack khali hai");
		}
		int rv = arr[top];

		return rv;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int size() {
		return top + 1;
	}

}
