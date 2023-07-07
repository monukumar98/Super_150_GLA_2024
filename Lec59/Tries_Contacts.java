package Lec59;

import java.util.HashMap;
public class Tries_Contacts {
	public class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal = false;
		int count = 0;
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.ch = '*';
		this.root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node();
				nn.ch = ch;
				nn.count = 1;
				curr.child.put(ch, nn);
				curr = nn;
			}

		}
		curr.isterminal = true;

	}

	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!curr.child.containsKey(ch)) {
				return 0;
			}
			curr = curr.child.get(ch);

		}
		return curr.count;
	}
	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("hack");
		t.insert("hackerrank");
		System.out.println(t.startsWith("hac"));
		System.out.println(t.startsWith("hak"));
	}

}
