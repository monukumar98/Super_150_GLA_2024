package Lec27;

import Lec26.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				a[i] = arr[idx];

			}
			arr=a;
			front=0;
		}
		super.Enqueue(item);
	}

}
