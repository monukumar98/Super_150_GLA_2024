package Lec14;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));

	}

	public static int fact(int n) {
       if(n==0) {
    	   return 1;
       }
		//int fn = fact(n - 1);
		return fact(n - 1)*n;

	}

}
