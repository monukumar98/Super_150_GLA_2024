package Lec56;

public class Set_bit_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int pos = 3;
		System.out.println(setornot(n, pos));

	}

	public static boolean setornot(int n, int pos) {

		int mask = (1 << pos);
		if ((n & mask) > 0) {
			return true;
		} else {
			return false;

		}
	}

}
