package Lec10;

import java.util.Scanner;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s == s1);
		System.out.println(s==s2);
		String s4 = "Hello"+"Bye";
		String s5 = "Hello"+"Bye";
		s= s +"Bye";
		System.out.println(s4==s5);
		System.out.println(s4==s);
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		System.out.println(ss);
	}

}
