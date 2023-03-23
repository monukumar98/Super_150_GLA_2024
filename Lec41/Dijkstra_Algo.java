package Lec41;

import java.util.*;

public class Dijkstra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1--> v2
		map.get(v2).put(v1, cost);// v2--> v1

	}

	private class Dijkstra_Pair {
		int vtx;
		String acq_path;
		int cost;

		public Dijkstra_Pair(int vtx, String acq_path, int cost) {
			// TODO Auto-generated constructor stub
			this.acq_path = acq_path;
			this.vtx = vtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " vai " + this.acq_path + " @ " + this.cost;
		}
	}

	public void DijkstraAlgo() {

		PriorityQueue<Dijkstra_Pair> pq = new PriorityQueue<>(new Comparator<Dijkstra_Pair>() {

			@Override
			public int compare(Dijkstra_Pair o1, Dijkstra_Pair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		Set<Integer> visited = new HashSet<>();
		pq.add(new Dijkstra_Pair(1, "1", 0));
		while (!pq.isEmpty()) {
			Dijkstra_Pair rp = pq.remove();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					pq.add(new Dijkstra_Pair(nbrs, rp.acq_path + nbrs, cost));

				}
			}

		}
	}

	public static void main(String[] args) {
		Dijkstra_Algo g = new Dijkstra_Algo(7);

		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.DijkstraAlgo();
	}

}
