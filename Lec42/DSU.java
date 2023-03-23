package Lec42;

import java.util.HashMap;

public class DSU {
	class Node {
		int vtx;
		Node parent;
		int rank;

	}

	HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) {
		Node node = new Node();
		node.vtx = v;
		node.parent = node;
		node.rank = 0;
		map.put(v, node);
	}

	public int find(int v) {
		Node nn = map.get(v);

		return find(nn).vtx;
	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		Node node = find(nn.parent);
		nn.parent = node;// path Compression
		return node;

	}

	public void Union(int v1, int v2) {
		Node n1 = map.get(v1);
		Node re1 = find(n1);
		Node n2 = map.get(v2);
		Node re2 = find(n2);
		if (re1.rank == re2.rank) {
			re1.parent = re2;
			re2.rank++;
		} else if (re1.rank < re2.rank) {
			re1.parent = re2;
		} else {
			re2.parent = re1;
		}

	}

}
