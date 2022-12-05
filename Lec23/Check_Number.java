package Lec23;

public class Check_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(53));

	}

	public static boolean isPrime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}

		return true;
	}

}
