package Lec45;

import java.util.*;

public class MST_0_1 {

	private HashMap<Integer, List<Integer>> map = new HashMap<>();

	public MST_0_1(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void AddEdge(int v1, int v2) {
		
		map.get(v1).add(v2);// v1--> v2
		map.get(v2).add(v1);// v2--> v1

	}

	public class PrimsPair {

		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " " + this.acqvtx + " @ " + this.cost;
		}
	}

	public int PrimsAlgo() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		pq.add(new PrimsPair(1, 1, 0));
		HashSet<Integer> visited = new HashSet<>();
		int sum = 0;
		
		while (!pq.isEmpty()) {
			
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			sum += rp.cost;
			visited.add(rp.vtx);
			for (int nbrs = 1; nbrs <= map.size(); nbrs++) {
				if (!visited.contains(nbrs)) {
					int cost = 0;
					if (map.get(rp.vtx).contains(nbrs)) {
						cost = 1;
					}
					PrimsPair np = new PrimsPair(nbrs, rp.vtx, cost);
					pq.add(np);
				}
			}

		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		MST_0_1 mst = new MST_0_1(n);
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			mst.AddEdge(v1, v2);
		}
		System.out.println(mst.PrimsAlgo());

	}

}
