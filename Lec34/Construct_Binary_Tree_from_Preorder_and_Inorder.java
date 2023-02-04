package Lec34;

public class Construct_Binary_Tree_from_Preorder_and_Inorder {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1);

		}

		private TreeNode CreateTree(int[] inorder, int ilo, int ihi, int[] preorder, int plo, int phi) {
			// TODO Auto-generated method stub
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode nn = new TreeNode(preorder[plo]);
			int idx = search(inorder, ilo, ihi, preorder[plo]);
			int net = idx - ilo;

			nn.left = CreateTree(inorder, ilo, idx - 1, preorder, plo + 1, plo + net);
			nn.right = CreateTree(inorder, idx + 1, ihi, preorder, plo + net + 1, phi);
			return nn;
		}

		public int search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return -1;
		}
	}

}
