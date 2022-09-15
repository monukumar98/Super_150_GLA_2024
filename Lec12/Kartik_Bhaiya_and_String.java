package Lec12;

public class Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabababbababaaaaaab";
		int k = 3;
		int flipa = perfectnessofastring(str, 'a', k);
		int flipb = perfectnessofastring(str, 'b', k);
		System.out.println(Math.max(flipa, flipb));

	}

	public static int perfectnessofastring(String str, char ch, int k) {

		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}

			while (flip > k) {

				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;

	}

}
