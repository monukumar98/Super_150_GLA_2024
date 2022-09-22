package Lec15;

public class Coin_Toss_No_2Head {

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
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			CoinTossss(n - 1, ans + "H");
		}
		CoinTossss(n - 1, ans + "T");

	}

}
