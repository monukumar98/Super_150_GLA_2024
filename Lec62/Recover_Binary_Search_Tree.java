package Lec62;

import java.util.*;

public class Recover_Binary_Search_Tree {
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
		public void recoverTree(TreeNode root) {
			List<TreeNode> list = new ArrayList<>();
			Inorder(root, list);
			TreeNode fist = null;
			TreeNode sec = null;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).val > list.get(i + 1).val) {
					fist = list.get(i);
					break;
				}
			}
			for (int i = list.size() - 1; i > 0; i--) {
				if (list.get(i).val < list.get(i - 1).val) {
					sec = list.get(i);
					break;
				}
			}
			int temp = fist.val;
			fist.val = sec.val;
			sec.val = temp;
		}

		public void Inorder(TreeNode root, List<TreeNode> list) {
			if (root == null) {
				return;
			}
			Inorder(root.left, list);
			list.add(root);
			Inorder(root.right, list);
		}
	}

}
