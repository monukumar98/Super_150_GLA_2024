package Lec10;

public class CamapreTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "raj";
		String str2 = "raju";
		System.out.println(iscampareto(str, str2));

	}

	public static int iscampareto(String s1, String s2) {
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) > s2.charAt(j)) {
				return s1.charAt(i) - s2.charAt(j);
			} else if (s1.charAt(i) < s2.charAt(j)) {
				return s2.charAt(i) - s1.charAt(j);
			}
			i++;
			j++;
		}
		return s1.length() - s2.length();

	}

}
