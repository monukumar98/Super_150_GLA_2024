package Lec37;

public class Cars implements Comparable<Cars> {

	int price;
	int speed;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C:" + this.color;

	}

	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		//return this.price - o.price;
		//return o.speed-this.speed;
		return this.color.compareTo(o.color);
	}

}
