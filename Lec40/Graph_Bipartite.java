package Lec40;

import java.util.*;

public class Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Map<Integer, Integer> visited = new HashMap<>();
			Queue<BipartitePair> q = new LinkedList<>();
			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rv = q.poll();// (1,0)
					// 2. if Already Visited then Ignore kro
					if (visited.containsKey(rv.vtx)) {

						if (visited.get(rv.vtx) != rv.lv)
							return false;
						else
							continue;
					}
					// 3. visited
					visited.put(rv.vtx, rv.lv);

					// 5. add nbrs
					for (int nbrs : graph[rv.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rv.lv + 1));
						}
					}

				}
			}
			return true;
		}

	}

	class BipartitePair {
		int vtx;
		int lv;

		public BipartitePair(int src, int lv) {
			// TODO Auto-generated constructor stub
			this.vtx = src;
			this.lv = lv;
		}
	}
}
