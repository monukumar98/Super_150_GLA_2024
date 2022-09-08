package Lec10;

public class lenWise_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		SubString(str);

	}

	public static void SubString(String str) {
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i, j));

			}
		}

	}

}
