package Lec6;

public class Min_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, -9, 7, -11 };
		System.out.println(Min(arr));

	}

	public static int Min(int[] arr) {
		
		int mini=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[mini]) {
				mini = i;
			}
			
		}
		return arr[mini];
		

	}

}
