package Lec3;

import java.util.Scanner;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b = (byte) (300);
		short s = 78;
		int i = 87;
		long l = 75667;
		System.out.println(b);
		b = (byte) (i);
		i = b;

		long ll = 2878_71987768686868l;

		float f = 8.9f;
		double d = 7.09;

		System.out.println(ll);
		System.out.println(f);
		System.out.println(d);
		int x1 = sc.nextInt();
		long l1 = sc.nextLong();
		
	}

}
