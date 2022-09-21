package Lec14;

public class Last_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 31, 5, 3, 6, 3, 7, 8 };
		int item = 3;
		System.out.println(LastIndex(arr, item, arr.length-1));

	}

	public static int LastIndex(int[] arr, int item, int i) {
		if(i<0) {
			return -1;
		}
		
		if(arr[i]==item) {
			return i;
		}
		
		return LastIndex(arr, item, i-1);

	}

}
