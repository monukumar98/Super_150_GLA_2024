package Lec35;

public class Validate_BST {

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

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			return VaildBst(root).isbst;
		}

		public BstPair VaildBst(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}

			BstPair lbp = VaildBst(root.left);
			BstPair rbp = VaildBst(root.right);
			BstPair sbp = new BstPair();
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			if (lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val) {
				sbp.isbst = true;
			} else
				sbp.isbst = false;

			return sbp;

		}
	}
}
