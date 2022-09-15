package Lec13;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);

		a1 = a;// AutoBoxing
		int x = 156;
		Integer y = 156;
		x = y;// unBoxing
		System.out.println(x == y);

		Integer c = 16;
		Integer c1 = 16;
		Integer d = 167;
		Integer d1 = 167;
		System.out.println(c == c1);
		System.out.println(d == d1);
	

	}

}
