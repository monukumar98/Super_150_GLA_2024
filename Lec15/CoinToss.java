package Lec15;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		CoinTossss(n, "");

	}

	public static void CoinTossss(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		CoinTossss(n - 1, ans + "H");
		CoinTossss(n - 1, ans + "T");

	}

}
