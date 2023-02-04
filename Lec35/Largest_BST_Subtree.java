package Lec35;



public class Largest_BST_Subtree {

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
		int size = 0;

	}

	class Solution {
		public int largestBSTSubtree(TreeNode root) {
			return VaildBst(root).size;
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
				sbp.size = lbp.size + rbp.size + 1;
			} else {
				sbp.isbst = false;
				sbp.size = Math.max(lbp.size, rbp.size);

			}

			return sbp;

		}

	}
}
