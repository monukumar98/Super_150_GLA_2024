package Lec57;

public class SubSeqnce_Using_Bitmalsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		SubSequne(str);

	}

	public static void SubSequne(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			pattern(i, str);

		}
	}

	private static void pattern(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i >>= 1;
			pos++;
		}
		System.out.println();

	}

}
