package Lec16;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		printanswer(str, "");

	}

	public static void printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean f = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					f = true;
					break;
				}

			}
			if (f == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				printanswer(s1 + s2, ans + ch);
			}

		}

	}

}
