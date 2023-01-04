package Lec31;

public class LinkedList {

	private class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

// O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (this.size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void addlast(int item) {

		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;

		}

	}

//   O(n)
	public void Addatindex(int item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("BkLOL k out of Range hai ");

		}
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node k_1th = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}

	}

	public int getFirst() {
		return head.val;
	}

	public int getlast() {
		return tail.val;
	}

	public int getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	// O(n)
	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("BkLOL k out of Range hai ");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;

	}

	public int removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node ss = GetNode(size - 2);
			int rv = tail.val;
			tail = ss;
			tail.next = null;
			size--;
			return rv;
		}

	}

	public int removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

}
