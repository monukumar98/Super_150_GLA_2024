package Lec6;

public class Swap_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 4 };
		int[] other = { -5, -3, -2, -1 };
		System.out.println(arr[0] + " " + other[1]);
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[1]);

	}

	public static void Swap(int [] arr, int [] other) {
		
		int [] temp = arr;
		arr=other;
		other=temp;
		
		
	}

}
