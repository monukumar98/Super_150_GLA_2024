package Lec5;

public class FUnction_demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 5;
		int b = 7;
		System.out.println(val);
		System.out.println(addition(b, a));
		System.out.println(val);
		System.out.println("bye");
	}

	public static int addition(int a, int b) {
		int val = 90;
		int c = a + b;
		FUnction_demo_3.val += 4;
		System.out.println(val);
		return c;
	}

}
