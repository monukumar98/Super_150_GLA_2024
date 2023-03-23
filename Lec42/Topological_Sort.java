package Lec42;

import java.util.*;

public class Topological_Sort {
	private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1--> v2

	}

	public void TopologicalSort() {
		int[] in = Indegre();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int rv = q.remove();
			System.out.print(rv);
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}

		}

	}

	public int[] Indegre() {
		int[] in = new int[map.size() + 1];
		for (int key : map.keySet()) {
			for (int nbrs : map.get(key).keySet()) {
				in[nbrs]++;
			}
		}
		return in;
	}
	public static void main(String[] args) {
		Topological_Sort t = new Topological_Sort(8);
		t.addEdge(1, 2,0);
		//t.addEdge(2, 1);
		t.addEdge(2, 4,0);
		t.addEdge(3, 1,0);
		t.addEdge(3, 2,0);
		t.addEdge(4, 5,0);
		t.addEdge(4, 6,0);
		t.addEdge(5, 6,0);
		t.addEdge(7, 8,0);
		System.out.println(Arrays.toString(t.Indegre()));
		t.TopologicalSort();
	}
}
