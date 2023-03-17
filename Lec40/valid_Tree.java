package Lec40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			return isValid(map);

		}

		public boolean isValid(HashMap<Integer, List<Integer>> map) {

			HashSet<Integer> visited = new HashSet<>();
			Stack<Integer> st = new Stack<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				st.push(src);
				while (!st.isEmpty()) {
					// 1. remove
					int rv = st.pop();
					// 2. if Already Visited then Ignore kro
					if (visited.contains(rv)) {
						return false;
					}
					// 3. visited
					visited.add(rv);

					// 5. add nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}

				}
			}
			return count == 1;
		}

	}

}
