package Lec42;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Cycle {

	private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Is_Cycle(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1--> v2

	}

	public boolean TopologicalSort() {
		int[] in = Indegre();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int count = 0;
		while (!q.isEmpty()) {
			int rv = q.remove();
			count++;
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}

		}
		return count == map.size() ? false : true;

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
		Is_Cycle t = new Is_Cycle(8);
		t.addEdge(1, 2,0);
		t.addEdge(1, 3,0);
		t.addEdge(2, 4,0);
		t.addEdge(3, 1,0);
		t.addEdge(3, 2,0);
		t.addEdge(4, 5,0);
		t.addEdge(4, 6,0);
		t.addEdge(5, 6,0);
		t.addEdge(7, 8,0);
		System.out.println(Arrays.toString(t.Indegre()));
		System.out.println(t.TopologicalSort());
	}

}
