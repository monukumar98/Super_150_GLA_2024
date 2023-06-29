package Lec58;

import java.util.Scanner;

public class Count_Good_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Good_Substrings(str);;
	}
	public static void Good_Substrings(String str) {
		long[][] arr = new long[2][2];
		long odd = 0, even = 0;
		for (int i = 1; i <= str.length(); i++) {
			odd++;
			if (i % 2 != 0) {
				odd += arr[str.charAt(i - 1) - 'a'][0];
				even += arr[str.charAt(i - 1) - 'a'][1];
				arr[str.charAt(i - 1) - 'a'][0]++;
			} else {
				odd += arr[str.charAt(i - 1) - 'a'][1];
				even += arr[str.charAt(i - 1) - 'a'][0];
				arr[str.charAt(i - 1) - 'a'][1]++;
			}
		}
		System.out.println(even + " " + odd);
	}

}
