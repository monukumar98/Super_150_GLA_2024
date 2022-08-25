package Lec4;

import java.util.Scanner;

public class Pattrrn_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int val=1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(val+"\t");
				j++;
				val++;
			}
			space--;
			star += 2;
			row++;
			System.out.println();
		}

	}

}
