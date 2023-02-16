package Lec36;

public class Distribute_Coins {

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
		int move = 0;

		public int distributeCoins(TreeNode root) {

			 distributeCoins1(root);
			 return move;
		}

		public int distributeCoins1(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = distributeCoins1(root.left);
			int right = distributeCoins1(root.right);
			move += Math.abs(left) + Math.abs(right);
			return left + right + root.val - 1;
		}
	}

}
