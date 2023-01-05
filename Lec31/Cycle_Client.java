package Lec31;

public class Cycle_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cycle_Create cc = new Cycle_Create();
		cc.addlast(1);
		cc.addlast(2);
		cc.addlast(3);
		cc.addlast(4);
		cc.addlast(5);
		cc.addlast(6);
		cc.addlast(7);
		cc.addlast(8);
		cc.CreateCycle();
		cc.CycleRemoval1();
		cc.display();

	}

}
