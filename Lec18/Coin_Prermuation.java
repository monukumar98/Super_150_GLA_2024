package Lec18;

public class Coin_Prermuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 7 };
		int amount = 10;
		Printanswer(coin, amount, "");

	}

	public static void Printanswer(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;

		}
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Printanswer(coin, amount - coin[i], ans + coin[i]);

			}
		}

	}

}
