package Lec56;

public class magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println(number(n));

	}
	public static int number(int n) {
		int ans=0;
		int mul=5;
		while(n>0) {
			if((n&1)!=0) {
				ans= ans + mul;
			}
			mul*=5;
			n>>=1;
		}
		return ans;
	}

}
