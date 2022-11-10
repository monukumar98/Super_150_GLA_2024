package Lec25;

public class Student {

	int age = 19;
	String name = "Kunal";

//	public Student() {
//		// TODO Auto-generated constructor stub
//	}

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(name + " Say Hey " + this.name);

	}

}
