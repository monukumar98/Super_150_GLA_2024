package Lec1;

public class Post_Pre_Inc_and_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		System.out.println(x++);// x = x+1;
		System.out.println(x);
		int c = x + x++ + 8 + x + x--;
		System.out.println(c);
		System.out.println(--x);

		int p = 11 + x++ + ++x + --x + x-- + 7 + x + 1;
		System.out.println(p);

	}

}
