package Lec4;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp1 = n - 1;
		int sp2 = -1;
		int star = 1;
		int row = 1;
		int val=1;
		while (row <= n) {
			int i = 1;
			while (i <= sp1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p=val;
			while (j <= star) {
				System.out.print(p+" ");
				p--;
				j++;
			}

			int k = 1;
			while (k <= sp2) {
				System.out.print("  ");
				k++;
			}

			int l = 1;
			p= p+1;
			if(row==1 || row==n) {
				l=2;
			}
			
			while (l <= star) {
				System.out.print(p+" ");
				p++;
				l++;
			}
			if (row <= n / 2) {
				star++;
				sp1 -= 2;
				sp2 += 2;
				val++;
			} else {
				star--;
				sp1 += 2;
				sp2 -= 2;
				val--;
			}
			row++;
			System.out.println();

		}

	}

}
