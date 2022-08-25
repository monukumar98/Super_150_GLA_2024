package Lec5;

import java.util.Scanner;

public class Is_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong(n));

	}

	public static boolean Armstrong(int n) {
		int cod = Countofdigit(n);
		int sum = 0;
		int k = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;
		}
		return sum == k;

	}

	public static int Countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;

		}
		return count;

	}

}
