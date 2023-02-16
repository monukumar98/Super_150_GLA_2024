package Lec35;

import Lec35.Largest_BST_Subtree.BstPair;
import Lec35.Largest_BST_Subtree.TreeNode;

public class Maximum_Sum_BST {
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
		int sum = 0;// bt sum
		int ans = 0;// bstt ans

	}

	class Solution {
		public int maxSumBST(TreeNode root) {
			return VaildBst(root).ans;

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

			} else {
				sbp.isbst = false;

			}

			return sbp;

		}
	}

}
