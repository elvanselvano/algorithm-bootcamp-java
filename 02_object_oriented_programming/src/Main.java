
public class Main {

	public Main() {
//		Animal a = new Animal(); // error
//		Cat c = new Cat();
//		c.name = "Budi";
//		System.out.println(c.name);
		
//		1. Abstract Method
//		Abstract class engga bsa bkin objectnya
//		Engga diisi blocknya, tujuannya untuk dioverride oleh child
//		Abstract method tidak boleh private
//		c.walk();
		
//		2. Encapsulation: menjaga data agar tidak diakses dari luar
//		Pakai access modifier private
		
//		Weapon w = new Weapon();
//		w.setId("W001");
//		w.setIsEnhanced(true);
//		w.setPrice(0);
		
//		3. Interface
//		- engga boleh ada fields (attributes)
//		- semua method otomatis abstract
//		- untuk wariskan, pakai implements
		
//		Abstract Class: child btuh attribute parent
//		Interface Class: child cuman butuh method parent
		
//		Polymorphism
//		Car car = new Avanza();
//		car.drive();
		
//		Interface
//		1 child hanya bisa punya 1 parent tapi bisa punya banyak interface
		
//		Default Method
//		Di java 8, ada default method di interface
//		Solve masalah ketika kita nambah method di interface, otomatis 
//		semua class yg implements interface tsb harus override
		
//		Equals & HashCode Method
//		== untuk data primitif, .equals()
		
//		Product p1 = new Product("Nokia", 150000);
//		Product p2 = new Product("Nokia", 150000);
//		
//		System.out.println(p1.toString());
//		System.out.println(p2);
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.hashCode() == p2.hashCode());
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
