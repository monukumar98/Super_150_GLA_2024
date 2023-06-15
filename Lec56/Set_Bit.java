package Lec56;

public class Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		System.out.println(countsetbit(n));
		System.out.println(fastCount(n));
	}

	public static int countsetbit(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}
	public static int fastCount(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n & (n - 1);
		}
		return count;

	}

}
