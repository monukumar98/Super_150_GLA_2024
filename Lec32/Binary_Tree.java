package Lec32;

import java.util.Scanner;

public class Binary_Tree {
	private class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}

		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "";
		s = "<--" + s + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);

	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.val + " ");
		InOrder(node.right);

	}

	public boolean Search(int item) {
		return Search(root, item);
	}

	private boolean Search(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}

		if (node.val == item) {
			return true;
		}
		boolean left = Search(node.left, item);
		boolean right = Search(node.right, item);

		return left || right;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int left = Max(node.left);
		int right = Max(node.right);
		return Math.max(left, Math.max(right, node.val));

	}
	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			
		}

		int left = ht(node.left);
		int right = ht(node.right);
		return Math.max(left, right)+1;
	}
	
}
