package java_classes;

public class Main {

	public static void main(String[] args) {
//		Create Object
//		Person p1 = new Person();
//		p1.name = "Hans";
//		p1.age = 20;
//		p1.university = "UI"; // error
//		System.out.println(p1); // address
		
//		Access Fields
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.university);
		
//		Access Methods
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		p1.name = "Hans";
//		p1.greet("Matt");
		
//		Constructor
//		Person p1 = new Person("Budi", 20);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
//		Inheritance
//		Teacher t = new Teacher("Johar", 25, "Calculus");
//		t.greet("Kevin");
		
//		Shape s1 = new Shape();
//		System.out.println(s1.name());
//		
//		Circle c1 = new Circle();
//		System.out.println(c1.name());
//		System.out.println(c1.parentName());
		
//		Di java, semua class adalah turunan dari class Object
//		Class Object adalah superclass dari semua class di Java
		
//		Polymorphism
//		Shape s = new Shape();
//		s = new Circle();
//		s = new PerfectCircle();
//		System.out.println(s.name());
		
//		Polymorphism in action
//		polymorphism(new Shape());
//		polymorphism(new Circle());
//		polymorphism(new PerfectCircle());
		
//		Type Check and Cast
//		polymorphism(new Circle());
		
//		Shape s = new Shape();
//		s = new Circle();
//		System.out.println(s.name());
//		System.out.println(s.getClass());
	}
	
//	static void polymorphism(Shape s) {
//		System.out.println("I am " + s.name());
//	}
	
//	static void polymorphism(Circle c) {
//		System.out.println("I am " + c.name());
//	}
//	
//	static void polymorphism(PerfectCircle pc) {
//		System.out.println("I am " + pc.name());
//	}
	
//	Type Check and Casts
	static void polymorphism(Shape s) {
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("I am " + c.name());
		} else if(s instanceof PerfectCircle) {
			PerfectCircle pc = (PerfectCircle) s;
			System.out.println("I am " + pc.name());
		} else {
			System.out.println("I am " + s.name());
		}
	}

}
