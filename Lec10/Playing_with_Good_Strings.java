package Lec10;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sqjwqffhaaioqabkkaeejhvjh";
		System.out.println(lenofgoodString(str));

	}

	public static int lenofgoodString(String s) {
		int ans = 0;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				c++;
			} else {
				ans = Math.max(ans, c);
				c = 0;
			}

		}
		ans = Math.max(ans, c);
		return ans;

	}

}
