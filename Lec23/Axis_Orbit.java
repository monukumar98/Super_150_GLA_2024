package Lec23;

public class Axis_Orbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.println(countPalindromic(s));

	}

	public static int countPalindromic(String s) {
		int count = 0;
		// odd
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; orbit < s.length() && axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				count++;

			}

		}
		// even
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; orbit < s.length() && axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
					break;
				}
				count++;

			}

		}
		return count;

	}

}
