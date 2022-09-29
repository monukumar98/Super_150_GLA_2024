package Lec17;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		LexicoConting(0, n);

	}

	public static void LexicoConting(int curr, int n) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);

		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			LexicoConting(curr * 10 + i, n);
		}
	}
}
