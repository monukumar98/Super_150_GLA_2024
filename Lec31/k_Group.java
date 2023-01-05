package Lec31;

import java.util.Stack;



public class k_Group {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			ListNode start = null;
			while (head != null) {
				if (st.size() == 0) {
					start = head;
				}
				st.push(head);
				if (st.size() == k) {
					while (!st.isEmpty()) {
						ListNode nn = new ListNode(st.pop().val);
						Dummy.next = nn;
						Dummy = Dummy.next;
					}
				}
				head = head.next;

			}
			if (st.size() > 0) {
				Dummy.next = start;
			}
			return temp.next;

		}
	}

}
