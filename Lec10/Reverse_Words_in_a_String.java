package Lec10;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("a good   example"));
	}

	public static String reverseWord(String s) {
		s = s.trim();
		String ans = "";
		String[] arr = s.split("\s+");
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();

	}
}
