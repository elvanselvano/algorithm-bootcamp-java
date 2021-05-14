package java_classes;

public class Teacher extends Person {
	String courseName;

	Teacher(String name, int age, String courseName) {
//		this.name = name;
//		this.age = age;
		super(name, age); // memanggil constructor parent
		this.courseName = courseName;
	}
	
//	Overriding
	void greet(String paramName) {
//		super.greet(paramName); // akses method greet di parent
		System.out.println("Hello " + paramName + ", my name is Mr." + this.name);
	}

}
