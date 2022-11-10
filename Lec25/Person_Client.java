package Lec25;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Person p = new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		p.name = "Kaju";
		p.age = 21;
		p.Intro_yourSelf();
		Person p1 = new Person();
		p1.name = "kamlesh";
		p1.age = 18;
		p1.Intro_yourSelf();
		p.SayHey("Ram");
		System.out.println(p1.count);
		Person.count += 21;
	}

}
