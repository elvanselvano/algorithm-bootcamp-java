package java_classes;

public class Circle extends Shape {
//	Overriding
	String name() {
		return "Circle";
	}
	
//	Access methodnya si parent
	String parentName() {
		return super.name();
	}
}
