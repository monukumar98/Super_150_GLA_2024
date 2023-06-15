package Lec55;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple";
		System.out.println(hascode(s));
	}

	public static int hascode(String s) {
		long mod = 1000_000_007;
		long pow = 1;
		long ans = 0;
		int pr = 31;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ans = (ans + ((ch - 'a' + 1) * pow) % mod) % mod;
			ans = (ans + mod) % mod;
			pow = (pow * pr) % mod;
		}
		return (int)(ans);
	}

}
