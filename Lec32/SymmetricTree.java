package Lec32;

public class SymmetricTree {
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
		public boolean isSymmetric(TreeNode root) {
			return Symmetric(root, root);

		}

		private boolean Symmetric(TreeNode node1, TreeNode node2) {
			// TODO Auto-generated method stub
			if (node1 == null && node2 == null) {
				return true;
			}
			if (node1 == null || node2 == null) {
				return false;
			}
			if (node1.val != node2.val) {
				return false;
			}
			boolean left = Symmetric(node1.left, node2.right);
			boolean right = Symmetric(node1.right, node2.left);

			return left && right;
		}
	}

}
