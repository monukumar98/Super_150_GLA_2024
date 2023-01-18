package Lec32;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		///bt.Display();
		//bt.PreOrder();
		//bt.PostOrder();
		bt.InOrder();
		System.out.println(bt.Search(-60));
		System.out.println(bt.Max());
//  10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
	}

}
