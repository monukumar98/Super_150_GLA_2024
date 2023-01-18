package Lec31;

public class Add_Two_Polynomials {

	class PolyNode {
		int coefficient, power;
		PolyNode next = null;

		PolyNode() {
		}

		PolyNode(int x, int y) {
			this.coefficient = x;
			this.power = y;
		}

		PolyNode(int x, int y, PolyNode next) {
			this.coefficient = x;
			this.power = y;
			this.next = next;
		}
	}

	class Solution {
		public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
			PolyNode Dummy = new PolyNode();
			PolyNode temp = Dummy;
			while (poly1 != null && poly2 != null) {
				if (poly1.power == poly2.power) {
					if (poly1.coefficient + poly2.coefficient != 0) {
						PolyNode nn = new PolyNode(poly1.coefficient + poly2.coefficient, poly1.power);
						Dummy.next = nn;
						Dummy = Dummy.next;
					}
					poly1 = poly1.next;
					poly2 = poly2.next;

				} else if (poly1.power > poly2.power) {
					PolyNode nn = new PolyNode(poly1.coefficient, poly1.power);
					Dummy.next = nn;
					Dummy = Dummy.next;
					poly1 = poly1.next;

				} else {
					PolyNode nn = new PolyNode(poly2.coefficient, poly2.power);
					Dummy.next = nn;
					Dummy = Dummy.next;
					poly2 = poly2.next;
				}
			}
			if (poly1 != null) {
				Dummy.next = poly1;

			}
			if (poly2 != null) {
				Dummy.next = poly2;

			}
			return temp.next;

		}
	}

}
