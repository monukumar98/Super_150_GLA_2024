package Lec62;

import java.util.List;

import Lec62.Recover_Binary_Search_Tree.TreeNode;

public class Recover_Binary_Search_Tree_Space_Op {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {

		TreeNode prev;
		TreeNode fist;
		TreeNode sec;
		public void recoverTree(TreeNode root) {
			Inorder(root);
			int temp = fist.val;
			fist.val = sec.val;
			sec.val = temp;
		}
		public void Inorder(TreeNode root) {
			if (root == null) {
				return;
			}
			Inorder(root.left);
			if (prev != null && prev.val > root.val) {
				if (fist == null) {
					fist = prev;
				} 
					sec = root;
				
			}
			prev = root;
			Inorder(root.right);
		}

	}
}
