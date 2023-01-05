package Lec31;

public class Cycle_Create {
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

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public void CreateCycle() throws Exception {
		tail.next = GetNode(2);
	}

	public Node MeetingPoint() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}

	public void CycleRemoval1() {

		Node meet = MeetingPoint();
		if (meet == null) {
			return;
		}
		Node temp = meet;
		int count = 1;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void CycleRemoval2() {

		Node meet = MeetingPoint();
		if (meet == null) {
			return;
		}
		Node fast = meet;

		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

}
