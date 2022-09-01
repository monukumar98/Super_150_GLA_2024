package Lec8;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int page[] = { 10, 20, 30, 40 };
		int nos = 2;
		System.out.println(minpage(page, nos));

	}

	public static int minpage(int[] page, int nos) {
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi += page[i];
		}
		int lo = 0;
		int ans = 0;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, mid, nos) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	private static boolean isitpossible(int[] page, int mid, int nos) {
		// TODO Auto-generated method stub
		int s = 1;
		int reapapge = 0;
		int i = 0;
		while (i < page.length) {
			if (reapapge + page[i] <= mid) {
				reapapge += page[i];
				i++;
			} else {
				reapapge = 0;
				s++;

			}
			if (s > nos) {
				return false;
			}
		}

		return true;

	}

}
