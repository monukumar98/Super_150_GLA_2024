package Lec26;

public class Student {

	private int age = 19;
	private String name = "Kaju";

	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//		throw new Exception("Bklol -ve age nhi hota hai");
//		}
//		this.age = age;
//	}

	public void setAge(int age) throws Exception {
		try {
			if (age < 0) {
				throw new Exception("Bklol -ve age nhi hota hai");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			System.out.println("I am in finaly blocks");
		}

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

}
