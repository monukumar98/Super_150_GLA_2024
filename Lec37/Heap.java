package Lec37;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			Swap(pi, ci);
			upheapify(pi);
		}

	}

	public void Swap(int i, int j) {
		int ith = list.get(i);
		int jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);
	}

	public int remove() {
		Swap(0, list.size() - 1);
		int rv = list.remove(list.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci<list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if (rci <list.size()&&list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(mini, pi);
			downheapify(mini);
		}

	}
	public int min()
	{
		return list.get(0);
	}
	public int size() {
		return list.size();
	}
	public void Display() {
		System.out.println(list);
	}
}
