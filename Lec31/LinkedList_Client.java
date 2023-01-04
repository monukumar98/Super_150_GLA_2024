package Lec31;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.display();
		ll.addlast(-9);
		ll.display();
		ll.Addatindex(80, 3);
		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getatindex(3));
//		System.out.println(ll.removefirst());
//		System.out.println(ll.removelast());
		System.out.println(ll.removeatindex(2));
		ll.display();

	}

}
