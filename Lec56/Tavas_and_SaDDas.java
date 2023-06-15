package Lec56;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(index(str));

	}

	public static int index(String str) {
		int n = str.length();
		int idx = (1 << n) - 2;
		int pos = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				idx = idx + (1 << pos);
			}
			pos++;
		}
		return  idx+1;
	}

}
