package Lec62;

import java.util.*;

public class Find_Duplicate_Subtrees {
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
		HashMap<String, TreeNode> map = new HashMap<>();
		HashSet<TreeNode> set = new HashSet<>();

		public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
			DuplicateSubtrees(root);
			return new ArrayList<>(set);
		}

		public String DuplicateSubtrees(TreeNode root) {
			if (root == null) {
				return "x";
			}
			String left = DuplicateSubtrees(root.left);
			String right = DuplicateSubtrees(root.right);
			String s = root.val + " " + left + " " + right;
			if (map.containsKey(s)) {
				set.add(map.get(s));
			} else {
				map.put(s, root);
			}
			return s;

		}
	}

}
