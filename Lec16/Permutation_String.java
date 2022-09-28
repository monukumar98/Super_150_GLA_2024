package Lec16;

public class Permutation_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printanswer(str, "");

	}

	public static void printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);

			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			printanswer(s1 + s2, ans + ch);

		}

	}
}
