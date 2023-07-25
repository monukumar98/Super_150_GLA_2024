package Lec63;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Additive_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "112358";
		List<BigInteger> ll = new LinkedList<>();
		System.out.println(IS_Additive(str, ll));
	}

	public static boolean IS_Additive(String ques, List<BigInteger> ll) {
		if (ques.length() == 0) {
			if (ll.size() >= 3) {
				return true;
			}

			return false;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s1 = ques.substring(0, i);
			if (nonleading(s1) && validAdditive(ll, s1)) {
				ll.add(new BigInteger(s1));
				boolean ans = IS_Additive(ques.substring(i), ll);
				if (ans) {
					return ans;
				}
				ll.remove(ll.size() - 1);
			}
		}
		return false;
	}

	private static boolean validAdditive(List<BigInteger> ll, String s1) {
		// TODO Auto-generated method stub
		if (ll.size() <= 1) {
			return true;
		}
		BigInteger f = ll.get(ll.size() - 1);
		BigInteger s = ll.get(ll.size() - 2);
		BigInteger ans = new BigInteger(s1);

		return f.add(s).equals(ans);
	}

	private static boolean nonleading(String s1) {
		// TODO Auto-generated method stub
		if (s1.length() == 1) {
			return true;
		}
		return s1.charAt(0) != '0';
	}

}
