package Lec56;

public class Single_Numbe_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 1, 0, 1, 99 };

	}

	public static int Single_Number(int[] arr) {
		int[] bit = new int[32];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int pos = 0;
			while (num > 0) {
				if ((num & 1) > 0) {
					bit[pos]++;
				}
				pos++;
				num >>= 1;
			}

		}
		for (int i = 0; i < bit.length; i++) {
			bit[i] %= 3;
		}
		return 0;
	}

}
