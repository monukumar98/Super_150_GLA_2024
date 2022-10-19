package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(str, list, ans);
		System.out.println(ans);

	}

	public static void Partitioning(String ques, List<String> list, List<List<String>> ans) {
		if (ques.length() == 0) {
			// System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (isPalindrome(s)) {
				list.add(s);
				Partitioning(ques.substring(cut), list, ans);
				list.remove(list.size() - 1);
			}

		}

	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
