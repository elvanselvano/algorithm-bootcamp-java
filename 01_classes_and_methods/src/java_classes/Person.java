package java_classes;

public class Person {
//	Add fields
	String name;
	int age;
	final String university = "Bina Nusantara"; // ga bisa diubah
	
//	Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	Overloading Constructor
//	Person(String name) {
//		this.name = name;
//		this.age = 10;
//	}
//	
//	Person(int age) {
//		this.name = "Engga mau nulis";
//		this.age = age;
//	}
	
//	Variable Shadowing
//	Person(String name, int age) {
//		name = name; // field name engga berubah
//		age = age;
//	}
//	Solve menggunakan this.
	
//	Source -> Generate Constructor Using Fields
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	//	Method
	void greet(String paramName) {
		System.out.println("Hello " + paramName + ", my name is " + this.name);
	}
}
