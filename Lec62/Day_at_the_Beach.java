package Lec62;

import java.util.*;

public class Day_at_the_Beach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] left = new int[n + 1];
		left[0] = Integer.MIN_VALUE;
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i - 1]);
		}
		int[] right = new int[n + 1];
		right[n] = Integer.MAX_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);
		}
		int part = 1;
		for (int i = 1; i < n; i++) {
			if (left[i] <= right[i]) {
				part++;
			}
		}
		System.out.println(part);

	}

}
