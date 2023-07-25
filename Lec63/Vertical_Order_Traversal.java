package Lec63;

import java.util.*;

public class Vertical_Order_Traversal {

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
		public List<List<Integer>> verticalTraversal(TreeNode root) {
			Queue<VerticalPair> q = new LinkedList<>();
			TreeMap<Integer, List<VerticalPair>> map = new TreeMap<>();
			q.add(new VerticalPair(0, 0, root));
			while (!q.isEmpty()) {
				VerticalPair rp = q.remove();
				if (!map.containsKey(rp.vl)) {
					map.put(rp.vl, new ArrayList<>());
				}
				map.get(rp.vl).add(rp);
				if (rp.node.left != null) {
					q.add(new VerticalPair(rp.hl + 1, rp.vl - 1, rp.node.left));
				}
				if (rp.node.right != null) {
					q.add(new VerticalPair(rp.hl + 1, rp.vl + 1, rp.node.right));
				}
			}
			List<List<Integer>> ans = new ArrayList<>();
			for (int key : map.keySet()) {
				List<VerticalPair> l = map.get(key);
				Collections.sort(l, new Comparator<VerticalPair>() {

					@Override
					public int compare(VerticalPair o1, VerticalPair o2) {
						// TODO Auto-generated method stub
						if (o1.hl == o2.hl) {
							return o1.node.val - o2.node.val;
						}
						return 0;
					}
				});
				List<Integer> ll1 = new ArrayList<>();
				for (VerticalPair vp : l) {
					ll1.add(vp.node.val);
				}
				ans.add(ll1);

			}
			return ans;

		}

		class VerticalPair {
			int hl;
			int vl;
			TreeNode node;

			public VerticalPair(int hl, int vl, TreeNode node) {
				// TODO Auto-generated constructor stub
				this.hl = hl;
				this.vl = vl;
				this.node = node;

			}

		}
	}

}
