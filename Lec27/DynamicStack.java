package Lec27;

import Lec26.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (this.isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				a[i] = arr[i];
			}
			arr = a;

		}
		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.display();
	}

}
