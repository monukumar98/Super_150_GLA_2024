package Lec23;

public class Time_and_space_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000;
		int k = 10;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}

		while (i <= n) {
			System.out.println("Hey");
			// Log(N)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// Log(N)

		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N/k)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base k
			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}

		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
			// O(N/k)
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// Sqrt(N)
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}

		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// Log(N)
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// N^2log(N)
				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				// Nlog(N)
				System.out.println("hey");
			}
		}
		// bubble
		// Selection
		// instersion

	}

}
