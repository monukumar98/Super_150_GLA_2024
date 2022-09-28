package Lec16;

public class Count_Sequnce {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
//		printpermutation(str, "");
//		System.out.println(count);
		System.out.println(Countpermutation(str, ""));

	}

	public static void printpermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		printpermutation(ques.substring(1), ans);
		printpermutation(ques.substring(1), ans + ch);

	}

	public static int Countpermutation(String ques, String ans) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int ans1 = Countpermutation(ques.substring(1), ans);
		int ans2 = Countpermutation(ques.substring(1), ans + ch);
		return ans1 + ans2;

	}

}
