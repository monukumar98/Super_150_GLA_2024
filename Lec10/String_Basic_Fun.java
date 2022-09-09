package Lec10;

public class String_Basic_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Helloheyokaybye";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
//		String str1 = "Helloheyokaybye";
//		System.out.println(str.equals(str1));
		String str1 = "raj";
		String str2 = "rajs";
		System.out.println(str1.compareTo(str2));
		System.out.println(str.substring(3, 5));
		String s1 = " Coding Blocks ";
		System.out.println(s1);
		System.out.println(s1.trim());

	}

}
