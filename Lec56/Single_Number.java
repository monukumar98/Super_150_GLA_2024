package Lec56;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 2, 1, 2 };
		System.out.println(Single_Number1(arr));
		
	}
	public static int Single_Number1(int []arr) {
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans=ans^arr[i];
		}
		return ans;
	}

}
