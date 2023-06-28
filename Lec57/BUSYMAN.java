package Lec57;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BUSYMAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < arr.length; i++) {
				int star = sc.nextInt();
				int end = sc.nextInt();
				arr[i] = new Pair(star, end);
			}
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.end - o2.end;

				}
			});
			int activitie = 1;
			int end = arr[0].end;
			for (int i = 1; i < arr.length; i++) {
				if (end <= arr[i].start) {
					activitie++;
					end = arr[i].end;
				}
			}
			System.out.println(activitie);

		}

	}

	public static class Pair {
		int start;
		int end;

		public Pair(int star, int end) {
			// TODO Auto-generated constructor stub
			this.start = star;
			this.end = end;
		}

	}

}
